/**
 * @param {number} n
 * @return {number}
 */
var pivotInteger = function(n)
{
   let lsum=0,tot=n*(n+1)/2;
    
    for(let i=1;i<=n;i++)
        {
            lsum+=i;
            if(lsum==tot)
                return i;
            tot-=i;
        }
    return -1;
};