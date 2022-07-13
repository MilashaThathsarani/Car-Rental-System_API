package main.advisor;

import main.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

public class AppWideExceptionHandler {
    @RestController
    @CrossOrigin
    public class AppWideExceptionHandler {
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler({Exception.class})
        public ResponseUtil exceptionHandler(Exception e){
            return new ResponseUtil(500,e.getMessage(),null);
        }
    }
}
