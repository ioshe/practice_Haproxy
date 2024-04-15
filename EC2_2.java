@RestController
public class controller {
    @GetMapping("/hey")
    public String getMethod() {
        return "pong!";
    }
}