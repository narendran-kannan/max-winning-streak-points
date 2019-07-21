

#include <stdio.h>

int main()
{
   
    int streaks=0;
    int n; int a[100]; int maximum=0;
    int i,j= 0;
    
    scanf("%d",&n);
    for(i= 0 ; i < n ; i++){
        
        scanf("%d",&a[i]);
        
    } 
    for(j=0; j<n; j++){
        
        if(a[j]>0){
            
            streaks = streaks + a[j];
            
        }else{
           
        
            streaks = 0;
        
            
        } if(streaks>maximum){
            maximum = streaks; }
        
    }
    
    printf("%d", maximum);
    
    return 0;
}


