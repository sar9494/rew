package bd2;

public class bodolt {
	
	int hicheeltsag1_3=24;
	int hicheelTsag4_8=34;
	int hicheelTsag9_10=36;
	int dundMin=45;   //dund sur 1tsag=45min 1978
	int deedTsag=18;
	int deedMin=90;  //deed sur 1tsag=90min 
	int subTime1_5=20;
	int subTime6_12=30;
	String fday="fri";
	
public int jil(int f, int l) {
	boolean old;
	boolean young;
	if((f>=1978&&l<=1993)) {
		old=true;
	}
	else if((f>=2006&&l<=2022)) {
		young=true;
	}
	
	return 0;
}
public int lSunday(int a) {
	int jil=a-1978, b=jil;
	int k = 0,l=270;
	int on=1978;
		while(jil>=0) {
			int m=(on-1976)%4;
			if(m==3) {
				l+=366;
				k=(l-3)%7;		
				}
			else if(jil==b){
				k=l%7;
				l+=3;
			}
			else {
				l+=365;
				k=(l-3)%7;
			}
			jil-=1;
			on+=1;
		}
	return 31-k;
}
public int fMonday(int a) {
	int day=5;
	int k=a-1976;
	int on=1978;
	while(k-2>=0) {
		if(on%4==0) {
			if(day==2) {
				day=7;
			}
			else if(day==1) {
				day=6;
			}
			else {
				day-=2;
			}
		}
		else {
			if(day==1) {
				day=7;
			}
			else {
				day-=1;
			}
		}
		on+=1;
		k-=1;
	}
	return day;
}
public void weekday(int a, int b) {
	//hicheellej baigaa 7 honogiin toog bodoh
	
}
public void hTsag(){
	//hicheellej bgaa tsagiig tootsoh
}
public void hHonog() {
	//hicheeliin udruud
}
public void angi() {
	//oniig ashiglan heddugeer angi gedegiig tootsooloh
}
public void dadlagaTsag() {
	//oyutanii dadlagiin hugatsaag bodoh
}
public void enjoyTime() {
	//sonirhson hicheel useh tsag
}
public static void main(String arg[]) {
	bodolt a=new bodolt();
	int on=1981;
	int l=a.lSunday(on);
	int k=a.fMonday(on);
	System.out.println(on+1+" on 5 sar suuliin sunday "+l);
	System.out.println(on+" onii 9 sariin ehnii monday "+k);
}
}



}
