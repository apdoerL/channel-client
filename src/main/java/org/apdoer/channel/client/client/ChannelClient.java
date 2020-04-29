package org.apdoer.channel.client.client;

import org.apdoer.channel.client.dto.MsgerRequestDto;
import org.apdoer.common.service.model.vo.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


/**
 * @author apdoer
 */
@FeignClient("channel-server")
public interface ChannelClient {

    @PostMapping("/msg/send")
    ResultVo send(@RequestBody final MsgerRequestDto request);

    @PostMapping("/msg/sendBatch")
    ResultVo sendBatch(@RequestBody final List<MsgerRequestDto> msgList);
}
