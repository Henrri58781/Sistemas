
package Metodos;

public class Hash {
    public int hashSimpleSuma(String matricula){
        int suma=0;
        String auxiliar="";
       
        for (int i=0; i<matricula.length(); i++){
            auxiliar=Character.toString(matricula.charAt(i));
            suma+= Integer.parseInt(auxiliar) ;
        }
        return suma;
    }
    public int hasSimple(String  matricula){
        int suma=hashSimpleSuma(matricula);
         int verificador=0;
        if(suma>=30){
            verificador=2;
        }else if(suma>19 & suma<30){
            verificador=1;
        }else{
            verificador=0;
        }
        return verificador;
    }
    public String SumaCaracteres(String matricula){
        int suma= hashSimpleSuma(matricula);
        int sumafinal= hashSimpleSuma(String.valueOf(suma));
        if(sumafinal>=10){
         return "Excelente";
        }else if(sumafinal>6 & sumafinal<10){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
        
    }
    
}
