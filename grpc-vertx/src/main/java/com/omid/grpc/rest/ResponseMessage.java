package com.omid.grpc.rest;

/**
 *
 * @author Omid Pourhadi
 *
 */
public class ResponseMessage
{

    private String message;
    private int code;

    public ResponseMessage(String message, int code)
    {
        this.message = message;
        this.code = code;
    }

    public ResponseMessage()
    {
    }

    public ResponseMessage message(String message)
    {
        return new ResponseMessage(message, 0);
    }

    public ResponseMessage code(int code)
    {
        return new ResponseMessage(null, code);
    }

    public String getMessage()
    {
        return message;
    }

    public int getCode()
    {
        return code;
    }

}
