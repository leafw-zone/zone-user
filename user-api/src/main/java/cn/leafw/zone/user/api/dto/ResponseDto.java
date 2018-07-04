package cn.leafw.zone.user.api.dto;

import lombok.Data;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/4 14:46
 */
@Data
public class ResponseDto {

    /**返回代码**/
    private String resultCode;
    /**返回结果**/
    private String resultMsg;
    /**返回数据**/
    private Object resultObj;

    public ResponseDto(String resultCode, String resultMsg, Object resultObj) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.resultObj = resultObj;
    }

    private ResponseDto(Object resultObj){
        this.resultCode ="0000";
        this.resultMsg ="成功";
        this.resultObj = resultObj;
    }

    public ResponseDto() {
    }

    public static ResponseDto instance(Object resultObj){
        return new ResponseDto(resultObj);
    }
}
