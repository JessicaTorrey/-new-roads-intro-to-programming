//this calss is to test the Card object
public class CardTester{
  
  //main method for testing
  public static void main(String[] args){
    
    //Card card = new Card("red", "diamonds", '8');
    //System.out.println(card);
    
    RedCard rCard = new RedCard(/*"hearts", '2'*/);
    rCard.setSuit("diamonds");
    rCard.setRank('3');
    System.out.println(rCard);
    
    BlackCard bCard = new BlackCard();
    bCard.setSuit("clubs");
    bCard.setRank('8');
    System.out.println(bCard);
    
    /*//creating a Card object
    Card c = new Card();
    
    c.setColor("black");
    
    //pring out card
    System.out.println(c.toString());
    
    //second card in hand
    Card c2 = new Card();
    
    c2.setColor("red");
    //set suit
    //set rank
    
    c2.setSuit("hearts");
    c2.setRank('7');
    
    System.out.println(c2.toString());
    
    Card c3 = new Card();
    c3.setColor("black");
    c3.setSuit("clubs");
    c3.setRank('J');
    System.out.println(c3.toString());
    
    Card c4 = new Card();
    c4.setColor("red");
    c4.setSuit("dimond");
    c4.setRank('3');
    System.out.println(c4.toString());
    
    Card c5 = new Card();
    c5.setColor("black");
    c5.setSuit("spade");
    c5.setRank('K');
    System.out.println(c5.toString());*/
      
  }
  
  
}//end of class