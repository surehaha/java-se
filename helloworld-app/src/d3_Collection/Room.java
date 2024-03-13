package d3_Collection;

import java.util.*;

public class Room {
    //有一副牌
    private List<Card> allCard=new ArrayList<>();
    public Room(){
        //点数：个数确定了，类型确定
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //花色：个数确定了，类型确定
        String[] colors={"*","%","#","@"};
        int size=0;//表示每张牌大小
        //遍历点数，再遍历花色，组织牌
        for (String number : numbers) {
            for (String color : colors) {
                //得到一张牌
                size++;//表示每张牌大小
                Card c=new Card(number,color,size);
                allCard.add(c);
            }

        }

        //单独存入大小王
        Card c1=new Card("","xiao",++size);
        Card c2=new Card("","da",++size);
        Collections.addAll(allCard,c1,c2);
        System.out.println("新牌："+allCard);

    }

    //游戏启动方法
    public void start() {
        //1.洗牌
        Collections.shuffle(allCard);
        System.out.println("洗牌后"+allCard);

        //2.发牌，定义三个玩家.
        List<Card> linhuchong=new ArrayList<>();
        List<Card> jiumozi=new ArrayList<>();
        List<Card> renyingying=new ArrayList<>();

        //正式发牌给这三个玩家，依次发出51张牌，剩余三张作为底牌
        //轮询发牌
        for (int i = 0; i < allCard.size()-3; i++) {
            Card c=allCard.get(i);
            if(i%3==0){
                linhuchong.add(c);
            } else if (i%3==1) {
                jiumozi.add(c);
            } else if (i%3==2) {
                renyingying.add(c);
            }

        }

        //3.对三个玩家的牌进行排序
        sortCard(linhuchong);
        sortCard(jiumozi);
        sortCard(renyingying);
        //4.看牌
        System.out.println("啊冲"+linhuchong);
        System.out.println("啊就"+jiumozi);
        System.out.println("盈盈"+renyingying);
        List<Card> lastThreeCards=allCard.subList(allCard.size()-3,allCard.size());//51，52，53
        System.out.println("底牌"+lastThreeCards);

        jiumozi.addAll(lastThreeCards);
        sortCard(jiumozi);
        System.out.println("抢到地主后"+jiumozi);

    }

    //集中进行排序
    private void sortCard(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getSize()-o1.getSize();
            }
        });
    }

    
}
