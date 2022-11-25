package com.java3y.austin.common.dto.account.sms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsAccount {
    /**
     * 标识渠道商Id
     */
    protected Integer supplierId;

    /**
     * 标识渠道商名字
     */
    protected String supplierName;

    /**
     * 【重要】类名，定位到具体的处理下发和回执逻辑
     *
     * 依据scriptName对应具体的某一个短信账号
     */
    protected String scriptName;
}
