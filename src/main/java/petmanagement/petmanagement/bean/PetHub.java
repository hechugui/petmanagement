package petmanagement.petmanagement.bean;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

// TODO: 2019/3/8  这个表我没建立

@Bean
//这个我不确定啊
public class PetHub {
    private Long id;
    private String name;
    private String depPath;
    //???????????????



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public PetHub(){
        //说好了，bean类必须有无参的构造函数
    }
    public PetHub(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||getClass()!=o.getClass()){
            //：它 会返回一个你的对象所对应的一个Class的对象，
            // 这个返回来的对象保存着你的原对象的类信息，
            // 比如你的原对象的类名叫什么，类里有什么方法，字段等
            //反正确实是用来确定是不是一个对象的
            return false;
        }
    }

    @Override
    public int hashCode(){
        return name!=null?name.hashCode():0;
        //对于不是null的name 生成他自己的hashcode
        //也是帮助equals确定是不是同一个对象的
        //用hashcode快，
        // 但是，hashCode()相等的两个对象他们的equal()不一定相等，
        // 也就是hashCode()不是绝对可靠的。
        //这和hash 的生产方法有关系
        //equal很准，但是慢
        //所以我们真正用的时候，都是联合用
    }









}
