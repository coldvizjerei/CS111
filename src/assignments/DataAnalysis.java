package assignments;

public class DataAnalysis {
	public static double[] getData(int len){
		ManageInput input = new ManageInput();
		double[] theData = new double[len];
		
		//reading entries into array
		System.out.println("Enter data");
		for (int i = 0; i < len; i++){
			String data = input.getInput();
			double x = input.stringToDouble(data);
			theData[i] = x;
		}
		return theData;
	}
	
	public static double min(double[] array){
		double min = array[0];
		return min;
	}	

	public static double max (int arraylength, double[] array){  
		double max = array[arraylength - 1];
		return max;
	}

	public static double sum(double arraylength, double[] array){
		double sum = 0;
		for (int i = 0; i < arraylength; i++){
			sum = sum + array[i]; 
		}
		return sum;
	}

	public static double mean(double arraylength, double[]a){
		double mean = 0;
		double sum = 0;
		for (int i = 0; i < arraylength; i++){
			sum = sum + a[i];
		}
		mean = sum / arraylength;
		return mean;
	}

	public static double median(int arraylength, double[]a){
		int middle = arraylength / 2;
		if (arraylength % 2 == 0){
			double answer = (a[middle] + (a[middle - 1])) / 2;
			return answer;
		}
		else{
			double answer = a[middle];
			return answer;
		}
	}

	public static double mode(double arraylength, double[]a){
		boolean error = true;
		double maxvalue = 0; 
		int maxcount = -1;
		for (int i = 0; i < arraylength; i++){
			int count = 1;
			for (int p = i + 1; p < arraylength; p++){
				if (a[p] == a[i]){
					count++;
				}
			}
			if (count == maxcount){
				error = true;
			}
			else if (count > maxcount){
				maxcount = count;
				maxvalue = a[i];
				error = false;
			}			  
		}
		if (error == true){
			maxvalue = -9000;
		}
		return maxvalue;
	}

	public static double[] sort(int arraylength, double[] array){ 

		for (int i = arraylength - 1; i >= 0; i--) 
		{ 
			for (int p = 0; p < arraylength - 1; p++) 
			{ 
				if (array[p] > array[p + 1]) 
				{ 
					double x = array[p]; 
					array[p] = array[p + 1]; 
					array[p + 1] = x; 
				} 
			} 
		} 
		return array; 
	}
}