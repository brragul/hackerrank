import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class JourneyToMoon {
	static HashMap<Integer, ArrayList<Integer>> h;
	public static void main(String[] args) {
		//long start=System.nanoTime();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long n=Integer.parseInt(sc.next());
		int l=Integer.parseInt(sc.next());
		int[][] arr = new int[l][2];
		for(int i=0;i<l;i++){
			arr[i][0]=Integer.parseInt(sc.next());
			arr[i][1]=Integer.parseInt(sc.next());
		}
		h= new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(arr[0][0]);
		l1.add(arr[0][1]);
		h.put(0, l1);
		for(int i=1;i<l;i++){
				h=checkForExist(arr[i][0], arr[i][1]);
		}
		long fin=((n*(n-1))/2);
		Long total =(long) 0;
		for(int i=0;i<h.size();i++){
			ArrayList<Integer> ls=h.get(i);
			long siz=ls.size();
			total=Math.addExact(total,(Math.multiplyExact(siz, siz-1))/2);
		}
		total=fin-total;
		System.out.println(total);
		//long end= System.nanoTime();
		//System.out.println((end-start)/1000000000);
	}
	static HashMap<Integer, ArrayList<Integer>> compareList(int hashkey){
		ArrayList<Integer> ls=h.get(hashkey);
		here:
			for(int l=0;l<h.size();l++){
					if(l!=hashkey)
					{
					ArrayList<Integer> ls1=h.get(l);
					ArrayList<Integer> temp = new ArrayList<Integer>(ls);
					ArrayList<Integer> temp1 = new ArrayList<Integer>(ls1);
					temp.retainAll(temp1);	
					if(temp.size()>0){
						h.put(l, mergeList(ls, ls1));
						h.remove(l);
						h=orderListInHash(l);
						break here;
					}
					}
			}
		return h;
	}
	
	static HashMap<Integer, ArrayList<Integer>> orderListInHash(int i){
		if(i<h.size()){
		for(int j=i;j<h.size();j++){
			ArrayList<Integer> ls = h.get(j+1);
			h.put(j, ls);
		}
		h.remove(h.size()-1);
		}
		return h;
	}
	
	static ArrayList<Integer> mergeList(ArrayList<Integer> ls,ArrayList<Integer> ls1){
		ArrayList<Integer> ls2 = new ArrayList<Integer>(ls1);
		ls2.removeAll(ls);
		for(int i=0;i<ls2.size();i++){
			ls.add(ls2.get(i));
		}
		return ls;
	}
	
	static HashMap<Integer, ArrayList<Integer>> checkForExist(int a,int b){
		int hashkey=0;
		 for(int i=0;i<h.size();i++){
			 ArrayList<Integer> ls=h.get(i);
			 if(ls.contains(a)|| ls.contains(b)){
				 if(ls.contains(a) && ls.contains(b)){return h;}
				 if(ls.contains(a)){ ls.add(b);h.put(i, ls); hashkey=i;break;}
				 if(ls.contains(b)){ ls.add(a);h.put(i, ls); hashkey=i;break;}
				 
			 }else{
				 if((i+1)==h.size()){
					 ArrayList<Integer> ls1 = new ArrayList<Integer>();
					 ls1.add(a);
					 ls1.add(b);
					 h.put(h.size(), ls1); 
					 return h;
				 }
			 }
		 }
		 h=compareList(hashkey);
		return h;
	}

}
