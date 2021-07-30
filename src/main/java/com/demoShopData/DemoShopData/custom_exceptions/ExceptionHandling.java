package com.demoShopData.DemoShopData.custom_exceptions;

import com.demoShopData.DemoShopData.models.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class ExceptionHandling {
    public static final String LOAISP_NOT_FOUND = "Không tìm thấy loại sản phẩm này";

    @ExceptionHandler(LoaiSanPhamNotFoundException.class)
    public ResponseEntity<HttpResponse> loaiSanPhamNotFoundException(){
        return createHttpResponse(BAD_REQUEST, LOAISP_NOT_FOUND);
    }

    private ResponseEntity<HttpResponse> createHttpResponse(HttpStatus httpStatus, String message) {
        HttpResponse httpResponse = new HttpResponse(httpStatus.value(),
                httpStatus, httpStatus.getReasonPhrase().toUpperCase(), message.toUpperCase());
        return new ResponseEntity<>(httpResponse, httpStatus);
    }


}
