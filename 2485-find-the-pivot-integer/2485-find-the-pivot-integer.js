/**
 * @param {number} n
 * @return {number}
 */
var pivotInteger = function(n)
{
    for(let i=1;i<=n;i++)
        {
            let ls=0;
            let rs=0;
            for(let j=1;j<=i;j++)
                {
                    ls+=j;
                }
            for(let j=i;j<=n;j++)
                {
                    rs+=j;
                }
            if(ls==rs)
                return i;
        }
    return -1;
};