package test.lib;

public class Linear {
    private Linear(){}
    public static double[] mult(double[][] A , double[] x){
        if(A.length != x.length){
            System.err.print("In function mult(double[][] , double[]),");
            System.err.println("matlix row length and vector length defered");
            System.exit(1);
            return x;
        }else{
            if(A.length==0){
                return new double[0];
            }else{
                double[] answer = new double[A[0].length];
                for(int i = 0;i<answer.length;i++){
                    answer[i] = 0;
                    for(int j = 0;j<x.length;j++){
                        answer[i] += A[i][j]*x[i];
                    }
                }
                return answer;
            }

        }
        
    }
}
