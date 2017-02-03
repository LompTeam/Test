public class Arvutused{
  public static double geoKeskmine(double [] arvud){
    double abi=1;
    for (int i=0; i<arvud.length; i++){
      abi=abi*arvud[i];
    }
    return Math.pow(abi, 1.0/arvud.length);
  /*  if(arvud.length==2){
      return Math.sqrt(arvud[0]*arvud[1]);
    }*/
    //return 0;
  }
}
