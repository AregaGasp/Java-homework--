public class Main {
public static void main(String[] args) {
int n = 6;
int m = 6;
	for (int i=0; i<n; i++) {
	String output = "";
   	   for (int j=0; j<m; j++){
        	if(i == 0 || j == 0 || i == n - 1 || j == m - 1) {
        	output +="*";
   		 }
		else {
        	output +=" ";
		}
}
    System.out.println(output);
	}


	for (int i=0; i<n; i++) {
	String output = "";
	   for (int j=0; j<m; j++){
       		 if((i+j)%2==1) {
        		output +=" ";
        		 }
        	else {
        	output +="*";
        		}
}
    System.out.println(output);

                        }
	for (int i=0; i<n; i++) {
	String output = "";
   		for (int j=0; j<m; j++){
	if( (i == 1 && (j > 0 && j < m - 1) ) || (j == 1 && (i > 0 && i < n - 1)) ||
      	(i == n - 2 && (j > 0 && j < m - 1) ) || (j == m - 2 && (i > 0 && i < n - 1))) {
        output +="*";
         }
        else {
        output +=" ";
        }
}
    System.out.println(output);

                        }



		}
	}
