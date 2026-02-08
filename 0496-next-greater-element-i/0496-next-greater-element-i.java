class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int i = 0;
        while(i<nums1.length)
        {
            Stack<Integer> st = new Stack<>();
            for(int j = nums2.length -1; j >= 0; j--)
            {
               st.push(nums2[j]);
            }
            while(!st.isEmpty())
            {
                if(nums1[i]!=st.peek())
                {
                    st.pop();
                }
                else
                {
                    st.pop();
                    while(!st.isEmpty() && nums1[i]>=st.peek())
                    {
                        st.pop();
                    }
                        if(st.isEmpty())
                        {
                            ans[i] = -1;
                        }
                        else
                        {
                            ans[i] = st.peek();
                        }
                    }
                }
                i++;
            }
          return ans;  
        }
        
    }
