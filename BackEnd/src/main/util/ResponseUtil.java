package main.util;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseUtil {
    private int code;
    private String massage;
    private Object data;
}
