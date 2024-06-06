package com.alta.springapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 *     "message":"success/failed",
 *     "data": ...
 * }
 *
 * {
 *  *         "meta":{
 *  *             "status":"ok",
 *  *             "message":""
 *  *         },
 *  *         "data":{
 *  *             ....
 *  *         }
 *  *     }
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WebResponse<T> {
    private String message;

    private T data;

}
