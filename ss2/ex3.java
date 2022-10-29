public class ex3 {

  public static void main(String[] args) {
    int traudung, traugia, traunam;
    for (traudung = 0; traudung <= 20; traudung++) {
      for (traunam = 0; traunam <= 33; traunam++) {
        for (traugia = 0; traugia <= (100 - traudung - traunam); traugia++) {
          if (traudung * 15 + traunam * 9 + traugia == 300 && traudung + traunam + traugia == 100) {
            System.out.println(traudung + " trâu đứng, " + traunam + " trâu nằm, " + traugia + "trâu già");
          }
        }
      }
    }
  }
}
