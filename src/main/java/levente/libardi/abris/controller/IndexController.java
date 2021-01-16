package levente.libardi.abris.controller;

import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class IndexController {

    @GetMapping("/")
    public String greeting(Device device) {

        String deviceType = "browser";
        String platform = "browser";
        String viewName = "index";

        if (device.isNormal()) {
            deviceType = "browser";
        } else if (device.isMobile()) {
            deviceType = "mobile";
            viewName = "mobile/index";
        } else if (device.isTablet()) {
            deviceType = "tablet";
            viewName = "tablet/index";
        }

        platform = device.getDevicePlatform().name();

        if (platform.equalsIgnoreCase("UNKNOWN")) {
            platform = "browser";
        }

        return viewName;
    }
}
