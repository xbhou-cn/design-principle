package xb.hou;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 如果新增一种用户类型，则需要修改发送邮件的方式，违反开闭原则
 *
 * @author HZ
 */
public class EmailSend {
    public void send(CommonCustomer custmer) {
        System.out.println(custmer.getName() + "-----" + custmer.getEmail());
    }

    public void send(VipCustomer custmer) {
        System.out.println(custmer.getName() + "-----" + custmer.getEmail());
    }

    public static void main(String[] args) {
        EmailSend es = new EmailSend();
        es.send(new CommonCustomer("普通顾客", "邮箱"));
        es.send(new CommonCustomer("Vip顾客", "邮箱"));
    }
}

@Data
@AllArgsConstructor
class CommonCustomer {
    private String name;
    private String email;
}

@Data
@AllArgsConstructor
class VipCustomer {
    private String name;
    private String email;
}
