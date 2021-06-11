package xb.hou.promote;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 使用里氏替换原则进行提升
 * 强调子类能扣完全替换父类
 * 如此修改，如果需要拓展一种用户，只需要继承Customer
 *
 * @author HZ
 */
public class EmailSend {
    public void send(Customer custmer) {
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
class Customer {
    private String name;
    private String email;
}

class CommonCustomer extends Customer {
    public CommonCustomer(String name, String email) {
        super(name, email);
    }
}

class VipCustomer extends Customer {
    public VipCustomer(String name, String email) {
        super(name, email);
    }
}
