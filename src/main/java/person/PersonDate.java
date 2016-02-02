package person;

public class PersonDate {
    public void Information (){
        PersonDescribe zhubajie,suwukong;
        zhubajie=new PersonDescribe();
        suwukong=new PersonDescribe();
        zhubajie.hight=1.8f;
        zhubajie.weight=180f;
        zhubajie.hand="两只黑手";
        zhubajie.ear="两只大耳朵";
        zhubajie.head="大头";
        zhubajie.foot="臭脚";
        zhubajie.mouth="大嘴";
        suwukong.hight=1.6f;
        suwukong.weight=80f;
        suwukong.hand="绣花小手";
        suwukong.ear="精巧小耳朵";
        suwukong.head="秀发飘飘";
        suwukong.foot="修长小脚";
        suwukong.mouth="樱桃小嘴";
        System.out.println("zhubajie 身高:"+zhubajie.hight);
        System.out.println("zhubajie 的头:"+zhubajie.head);
        System.out.println("suwukong 身高:"+suwukong.hight);
        System.out.println("suwukong 的头:"+suwukong.head);
        zhubajie.speak("我要取媳妇");
        System.out.println("zhubajie 的头:"+zhubajie.head);
        suwukong.speak("让老猪背我");
        System.out.println("suwukong 的头:"+suwukong.head);
    }

}

	
