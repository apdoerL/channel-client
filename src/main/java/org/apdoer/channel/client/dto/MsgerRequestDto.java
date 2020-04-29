
package org.apdoer.channel.client.dto;

import lombok.*;

import java.util.Map;


/**
 * @author apdoer
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MsgerRequestDto {
    private String contact;
    private String locale;
    private String template;
    /**
     * 透传参数
     */
    private Map<String, String> params;
    private String ip;
    private String areaCode;

}
