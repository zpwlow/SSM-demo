package com.hstc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //除了有参构造，其他都有
@AllArgsConstructor //加入有参构造，但无参没了
@NoArgsConstructor  //加入无参
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}