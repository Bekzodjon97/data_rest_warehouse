package uz.pdp.appwarehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.payload.Result;
import uz.pdp.appwarehouse.service.AttechmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/attechment")
public class AttachmentController {

    @Autowired
    AttechmentService attechmentService;



    @PostMapping(value = "/upload")
    public Result uploadFile(MultipartHttpServletRequest request) throws IOException {
        return attechmentService.uploadAttachment(request);

    }


    @GetMapping(value = "/info")
    public List<Attachment> getInfo(){
        return attechmentService.getAttachment();
    }

    @GetMapping(value = "/info{id}")
    public Attachment getAttachmentInfo(@PathVariable Integer id){

        return attechmentService.getAttachmentById(id);
    }

    @GetMapping(value = "/download/{id}")
    public void download(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attechmentService.downloadAttachment(id, response);
    }
}
