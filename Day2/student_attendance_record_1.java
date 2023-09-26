//   https://leetcode.com/problems/student-attendance-record-i/ 

package Day2;

public class student_attendance_record_1 {

    public boolean checkRecord(String s) {

        int size=s.length();
    if(s.replace("A","").length()<=size-2||s.indexOf("LLL")!=-1)return false;

    return true;

    }
}

    
    /* OR:-
    
    public boolean checkRecord(String s) {

        int i=0;
        

        for(int k  = 0 ; k < s.length() ; k++){

            if(s.charAt(k) == 'A'){
                i++;
            }
        }

        if( i >= 2){
            return false;
        }


        for(int k =0 ; k <= s.length() -3 ; k++){

            if(s.charAt(k) == 'L' && s.charAt(k+1) == 'L' && s.charAt(k+2) == 'L'){
                return false;
            }
        }
        return true;
    }
}*/
