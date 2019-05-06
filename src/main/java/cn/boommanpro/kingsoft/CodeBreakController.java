package cn.boommanpro.kingsoft;

import com.boommanpro.codebreak.core.CodeBreak;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author wangqm-b
 * @create 2018/5/15
 */
@RestController
public class CodeBreakController {
    //在线地址测试
    @PostMapping("/codeBreakOfFile")
    public String codeBreakOfFile(@RequestParam("file") MultipartFile file) throws IOException {
        return CodeBreak.codeBreak(file.getInputStream());
    }



    //上传图片



    //正式调用api

    @PostMapping("/codeBreakOfStream")
    public String codeBreakOfStream(@RequestParam("file") MultipartFile file) throws IOException {
        return CodeBreak.codeBreak(file.getInputStream());
    }

    @PostMapping("/codeBreakOfHtml")
    public String codeBreak(@RequestParam("file") MultipartFile file) throws IOException {
        return CodeBreak.codeBreak(file.getInputStream());
    }


}
