package collabhubbr.projects.infra.client;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-infos", url = "${microservice.endpoint.events}")
public interface UserPermissionClient {
    @GetMapping("/{userId}")
    Response getUserInfos(@PathVariable Long userId);
}