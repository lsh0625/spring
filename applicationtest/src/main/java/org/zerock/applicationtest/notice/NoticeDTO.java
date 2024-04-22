package org.zerock.applicationtest.notice;



import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class NoticeDTO {
    private int no;
    private String title;
    private String content;
    private int count;
    private String create_date;

}
