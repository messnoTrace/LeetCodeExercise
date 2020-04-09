package com.notrace;


import java.util.*;

public class Main {

    static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        //        System.out.println(removeOuterParentheses("((()())(()()))"));
//        System.out.println(subsets(new int[]{1, 2, 3}));
//        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));

//        totalNQueens(4);

//        permute(new int[]{1, 2, 3});
//
//        diStringMatch("III");
//        minDeletionSize(new String[]{"zyx", "wvu", "tsr"});

//        arrayPairSum(new int[]{1, 4, 3, 2});
//        reverseWords("Let's take LeetCode contest");
//        commonChars(new String[]{"cool", "lock", "cook"});
//        titleToNumber("AAA");

//        findOcurrences("we will we will rock you", "we", "will");
//        countPrimeSetBits(6, 10);
//        singleNumber(new int[]{1, 2, 3, 2, 3});
        //[7,5,4,7,10,7,9,4,8,9,6,5,4,2,3,10,9,9,3,7,5,2,9,4,8,9]
        //"zlrovckbgjqofmdzqetflraziyvkvcxzahzuuveypqxmjbwrjvmpdxjuhqyktuwjvmbeswxuznumazgxvitdrzxmqzhaaudztgie"
//        numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
//        distributeCandies(new int[]{1, 1, 2, 2, 3, 3});

//        islandPerimeter(new int[][]{{0, 1, 1, 0},
//                {1, 1, 1, 0},
//                {0, 1, 0, 0},
//                {1, 1, 0, 0}});

//        projectionArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}});

//        matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);

//        nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});

//        System.out.println("---" + uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
//        System.out.println("===" + letterCasePermutation("a1b2").toString());
//        System.out.println("===" + canPlaceFlowers(new int[]{1, 0, 0, 0, 0}, 2));
//        coinChange(new int[]{1, 2, 5}, 11);

//        System.out.println("----" + isSubsequence("leeeeetcode", "yyyyylyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeyyyyyyeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyytyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyycyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyoyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyydyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy\""));
        System.out.println("------" + superEggDrop(3, 14));
    }

    /**
     * @param S
     * @return
     * @see<a href="https://leetcode-cn.com/problems/letter-case-permutation/">大小写字母全排列</a>
     */
    public static List<String> letterCasePermutation(String S) {
        List<String> listResult = new ArrayList<>();

        Character[] source = new Character[S.length()];
        for (int i = 0; i < S.length(); i++) {
            source[i] = S.charAt(i);
        }
        dfs(0, source, listResult);
        return listResult;

    }


    public static void dfs(int index, Character[] s, List<String> resultList) {
        //边界条件
        int length = s.length;
        if (index == length - 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(s[i]);
            }
            resultList.add(sb.toString());
            return;
        }

        dfs(index + 1, s, resultList);

        if (isChar(s[index])) {
            //不是字符 下一个
//            s[index] ^= (1<<5);
            if (Character.isUpperCase(s[index])) {
                //是大写转为小写
                s[index] = Character.toLowerCase(s[index]);
            } else {
                s[index] = Character.toUpperCase(s[index]);
            }
            dfs(index + 1, s, resultList);
        }


    }

    /**
     * @param arr
     * @return
     * @see <a href="https://leetcode-cn.com/problems/unique-number-of-occurrences/">独一无二的出现次数</a>
     */
    public static boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (Integer value : arr) {
            Integer temp = map.get(value);
            map.put(temp, temp == null ? 1 : temp + 1);
        }

        Set<Integer> set = new HashSet<Integer>(map.values());
        if (map.size() == set.size()) {
            return true;
        } else return false;

    }

    /**
     * @param root
     * @return
     * @see<a href="https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/">二叉树的最大深度</a>
     */
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;

    }

    /**
     * @param root
     * @return
     * @see<a href="https://leetcode-cn.com/problems/invert-binary-tree/">反转二叉树</a>
     */
    public TreeNode invertTree(TreeNode root) {

        //递归结束条件
        if (root == null || (root.right == null && root.left == null))
            return root;
        //临时变量记录左右节点地址
        TreeNode left = root.left;
        TreeNode right = root.right;
        //交换左右节点
        root.right = invertTree(left);
        root.left = invertTree(right);
        return root;
    }


    /**
     * @param t1
     * @param t2
     * @return
     * @see <a href="https://leetcode-cn.com/problems/merge-two-binary-trees/">合并二叉树</a>
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode currentNode = null;

        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        currentNode = new TreeNode(t1.val + t2.val);
        currentNode.left = mergeTrees(t1.left, t2.left);
        currentNode.right = mergeTrees(t1.right, t2.right);


        return currentNode;
    }

    /**
     * @param node
     * @see<a href="https://leetcode-cn.com/problems/delete-node-in-a-linked-list/">删除链表中的节点</a>
     */
    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * @param root
     * @param L
     * @param R
     * @return
     * @see <a href="https://leetcode-cn.com/problems/range-sum-of-bst/">二叉搜索树的范围和</a>
     */
    public static int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        }

        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);


    }


    /**
     * @param n
     * @return
     * @see <a href="https://leetcode-cn.com/problems/binary-number-with-alternating-bits/">交替位二进制数</a>
     */
    public static boolean hasAlternatingBits(int n) {
        int temp = n ^ (n >> 1);
        return (temp & (temp + 1)) == 0;
    }

    /**
     * @param nums1
     * @param nums2
     * @return
     * @see<a href="https://leetcode-cn.com/problems/next-greater-element-i/">下一个更大元素1</>
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> hasMap = new HashMap<Integer, Integer>();

        int[] result = new int[nums1.length];

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                hasMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) result[i] = hasMap.getOrDefault(nums1[i], -1);

        return result;
    }

    /**
     * @param nums
     * @return
     * @see<a href="https://leetcode-cn.com/problems/majority-element/comments/">求众数(摩尔投票算法)</a>
     */
    public static int majorityElement(int[] nums) {

        int rect = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (rect == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    rect = nums[i + 1];
                }
            }
        }
        return rect;
    }

    /**
     * @param n
     * @return
     * @see <a href="https://leetcode-cn.com/problems/fizz-buzz/">Fizz Buzz</a>
     */
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {

                list.add("Fizz");
            } else if (i % 5 == 0) {

                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }

        return list;
    }

    /**
     * @param nums
     * @param r
     * @param c
     * @return
     * @see <a href="https://leetcode-cn.com/problems/reshape-the-matrix/">重塑矩阵</a>
     */
    public static int[][] matrixReshape(int[][] nums, int r, int c) {

        if (r * c > nums.length * nums[0].length) {
            return nums;
        }


        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }


        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = ((ArrayDeque<Integer>) queue).pop();
            }
        }


        return result;
    }


    /**
     * @param grid
     * @return
     * @see <a href="https://leetcode-cn.com/problems/projection-area-of-3d-shapes/">三维形体投影面积</a>
     */
    public static int projectionArea(int[][] grid) {

        int countx = 0, county = 0, countz = 0;
        for (int i = 0; i < grid.length; i++) {

            int rowMax = 0, columnMax = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    countz += 1;
                }
                rowMax = Math.max(rowMax, grid[i][j]);
                columnMax = Math.max(columnMax, grid[j][i]);

            }

            county += columnMax;
            countx += rowMax;

        }

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {

            }
        }


        return countx + county + countz;

    }

    /**
     * @param grid
     * @return
     * @see<a href="https://leetcode-cn.com/problems/island-perimeter/">岛屿的周长</a>
     */

    public static int islandPerimeter(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count += 4;

                    //左
                    if (j - 1 >= 0) {
                        if (grid[i][j - 1] == 1) {
                            count -= 1;
                        }
                    }
                    //上
                    if (i - 1 >= 0) {
                        if (grid[i - 1][j] == 1) {
                            count -= 1;
                        }
                    }
                    //右

                    if (j + 1 <= grid[0].length - 1) {

                        if (grid[i][j + 1] == 1) {
                            count -= 1;
                        }
                    }
                    //xia
                    if (i + 1 <= grid.length - 1) {
                        if (grid[i + 1][j] == 1) {
                            count -= 1;
                        }
                    }
                }
            }
        }

        return count;

    }

    /**
     * @param candies
     * @return
     * @see <a href="https://leetcode-cn.com/problems/distribute-candies/">分糖果</a>
     */
    public static int distributeCandies(int[] candies) {


        Set<Integer> set = new HashSet<>();

        for (int item : candies) {
            set.add(item);
        }
        return Math.min(set.size(), candies.length / 2);
    }

    /**
     * @param widths
     * @param S
     * @return
     * @see <a href="https://leetcode-cn.com/problems/number-of-lines-to-write-string/">写字符串需要的行数</a>
     */
    public static int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        result[0] = 1;
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char item = S.charAt(i);
            int index = item - 'a';
            int width = widths[index];

            if (count + width < 100) {
                count = count + width;
                result[1] = count;
            } else if (width + count == 100) {
                result[0] += 1;
                result[1] = 0;

                count = 0;
            } else {
                result[0] += 1;
                result[1] = width;
                count = width;
            }

        }

        return result;

    }

    /**
     * @param nums
     * @return
     * @see <a href="https://leetcode-cn.com/problems/single-number">只出现一次的数字</a>
     * 异或
     */
    public static int singleNumber(int[] nums) {

        int res = 0;

        for (int num : nums) {
            res = res ^ num;
        }

        return res;

    }

    /**
     * @param L
     * @param R
     * @return
     * @see<a href="https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/">二进制表示中质数个计算置位</a>
     */
    public static int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            String binaryString = Integer.toBinaryString(i);

            int count = 0;
            for (int d = 0; d < binaryString.length(); d++) {
                if (binaryString.charAt(d) == '1') {
                    count++;
                }
            }

            if (isPrimeNumber(count)) {
                result += 1;
            }
        }
        return result;
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * @param head
     * @return
     * @see <a href="https://leetcode-cn.com/problems/reverse-linked-list/">反转链表</a>
     */
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextTmp = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextTmp;
        }

        return prevNode;

    }


    /**
     * @param text
     * @param first
     * @param second
     * @return
     * @see <a href="https://leetcode-cn.com/problems/occurrences-after-bigram/">Bigram 分词</a>
     */
    public static String[] findOcurrences(String text, String first, String second) {

        List<String> list = new ArrayList<>();
        String[] spliteArr = text.split(" ");

        for (int i = 0; i < spliteArr.length; i++) {

            if (i != spliteArr.length - 1) {
                if (spliteArr[i].equals(first) && spliteArr[i + 1].equals(second)) {
                    if (i + 2 < spliteArr.length) {
                        list.add(spliteArr[i + 2]);
                    }
                }

            }
        }

        String[] arr = list.toArray(new String[list.size()]);

        return arr;
    }

    /**
     * see <a href="https://leetcode-cn.com/problems/excel-sheet-column-number/">Excel表序列号</a>
     *
     * @param s
     * @return
     */

    public static int titleToNumber(String s) {
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int temp = s.charAt(i) - 'A' + 1;
            sum = sum * 26 + temp;

//            int temp = s.charAt(len-i-1) - 'A' + 1;
//            sum += temp * Math.pow(26, i);
        }
        return sum;
    }


    /**
     * see <a href="https://leetcode-cn.com/problems/find-common-characters/">查找常用字符</a>
     *
     * @param A
     * @return
     */
    public static List<String> commonChars(String[] A) {

        List<String> list = new ArrayList<>();
        /**
         int minIndex = 0;
         for (int i = 0; i < A.length; i++) {
         minIndex = A[i].length() > A[minIndex].length() ? minIndex : i;
         }

         List<HashMap<String, Integer>> maplist = new ArrayList<>();

         for (int i = 0; i < A.length; i++) {
         HashMap<String, Integer> map = new HashMap<>();

         for (int j = 0; j < A[i].length(); j++) {
         if (map.containsKey(String.valueOf(A[i].charAt(j)))) {

         int value = map.get(String.valueOf(A[i].charAt(j)));
         value = value + 1;
         map.put(String.valueOf(A[i].charAt(j)), value);
         } else {
         map.put(String.valueOf(A[i].charAt(j)), 1);
         }
         }
         maplist.add(map);
         }


         HashMap<String, Integer> min = maplist.get(minIndex);

         for (Map.Entry<String, Integer> entry : min.entrySet()) {
         String key = entry.getKey();

         boolean constants = true;
         for (int i = 0; i < maplist.size(); i++) {
         constants = constants && maplist.get(i).containsKey(key);
         }
         if (constants) {
         int minValue = entry.getValue();
         for (int i = 0; i < maplist.size(); i++) {
         minValue = Math.min(minValue, maplist.get(i).get(key));
         }

         for (int i = 0; i < minValue; i++) {
         list.add(key);
         }
         }
         }
         **/
        int[] res = new int[26];
        for (char c : A[0].toCharArray()) {
            res[c - 'a']++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] temp = new int[26];
            for (char c : A[i].toCharArray()) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                res[j] = Math.min(res[j], temp[j]);
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] > 0) {
                for (int j = 0; j < res[i]; j++) {
                    list.add(((char) ('a' + i) + ""));
                }
            }
        }

        return list;
    }

    /**
     * see <a href="https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/submissions/">反转字符串中的单词 III</a>
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        StringBuilder sb;
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            sb = new StringBuilder(array[i]);
            array[i] = sb.reverse().toString();
        }
        sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    /**
     * see <a href="https://leetcode-cn.com/problems/array-partition-i/submissions/">数组拆分1</>
     *
     * @param nums
     * @return
     */
    public static int arrayPairSum(int[] nums) {

        int min = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                min = min + nums[i];

            }
        }

        System.out.println("min=" + min);

        return min;
    }

    /**
     * see<a href="https://leetcode-cn.com/problems/delete-columns-to-make-sorted/">删列造序</>
     *
     * @param A
     * @return
     */

    public static int minDeletionSize(String[] A) {

        int count = 0;

        if (A[0].length() == 1)
            return 0;
        String[][] source = new String[A.length][A[0].length()];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length(); j++) {
                source[i][j] = String.valueOf(A[i].charAt(j));
            }
        }


        for (int i = 0; i < source[0].length; i++) {
            for (int j = 0; j < source.length - 1; j++) {
                System.out.println("[j][i]:" + source[j][i] + " source[j+1][i]:" + source[j + 1][i]);
                if (source[j][i].compareTo(source[j + 1][i]) > 0) {

                    count++;
                    break;
                }
            }

        }
        System.out.println("count=" + count);
        return count;
    }

    /**
     * @param S see<a href="https://leetcode-cn.com/problems/di-string-match/submissions/">增减字符串</>
     * @return
     */
    public static int[] diStringMatch(String S) {
        int length = S.length();
        int[] result = new int[length + 1];
        int max = length;
        int min = 0;

        for (int i = 0; i < length; i++) {

            if (S.charAt(i) == 'D') {
                result[i] = max--;

            } else {
                result[i] = min++;
            }

        }
        result[length] = max;


        return result;
    }


    /**
     * 子集
     *
     * @param nums
     * @return
     * @see <a href="https://leetcode-cn.com/problems/subsets/">子集</a>
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> source = new ArrayList<>();
        for (int a : nums) {
            source.add(a);
        }
        List<List<Integer>> result = new ArrayList<>();
        dfs(0, source, list, result);
        return result;


    }

    public static void dfs(int i, List<Integer> list, List<Integer> li, List<List<Integer>> result) {
        if (i > list.size() - 1) {
            System.out.println(li);
            result.add(new ArrayList<>(li));
        } else {
            li.add(list.get(i));//左加
            dfs(i + 1, list, li, result); //递归方法
            li.remove(list.get(i)); //右去
            dfs(i + 1, list, li, result);
        }
    }


    /**
     * 去掉括号
     *
     * @param S
     * @return
     * @see <a href="https://leetcode-cn.com/problems/remove-outermost-parentheses/">去掉括号</a>
     */

    public static String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();

        int flag = 0;

        char[] arr = S.toCharArray();
        for (char a : arr) {
            if (a == '(') {
                flag++;
                if (flag == 1) {
                    continue;
                }
            } else if (a == ')') {
                flag--;
                if (flag == 0) {
                    continue;
                }
            }
            result.append(a);
        }

        return result.toString();
    }


    /**
     * @param words
     * @return
     * @see<a href="https://leetcode-cn.com/problems/unique-morse-code-words/">唯一摩尔斯密码词<a/>
     */
    public static int uniqueMorseRepresentations(String[] words) {
        Map pwd = new HashMap();
        pwd.put("a", ".-");
        pwd.put("b", "-...");
        pwd.put("c", "-.-.");
        pwd.put("d", "-..");
        pwd.put("e", ".");
        pwd.put("f", "..-.");
        pwd.put("g", "--.");
        pwd.put("h", "....");
        pwd.put("i", "..");
        pwd.put("j", ".---");
        pwd.put("k", "-.-");
        pwd.put("l", ".-..");
        pwd.put("m", "--");
        pwd.put("n", "-.");
        pwd.put("o", "---");
        pwd.put("p", ".--.");
        pwd.put("q", "--.-");
        pwd.put("r", ".-.");
        pwd.put("s", "...");
        pwd.put("t", "-");
        pwd.put("u", "..-");
        pwd.put("v", "...-");
        pwd.put("w", ".--");
        pwd.put("x", "-..-");
        pwd.put("y", "-.--");
        pwd.put("z", "--..");

        Map result = new HashMap();
        StringBuilder sb;
        for (String str : words) {
            sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                String value = (String) pwd.get(String.valueOf(str.charAt(i)).toLowerCase());
                sb.append(value);
            }
            result.put(sb.toString(), sb.toString());
        }


        return result.size();
    }


    public static int totalNQueens(int n) {

        Queen queen = new Queen(n);
        queen.find(0);


        return queen.count;
    }


    public static List<List<Integer>> permute(int[] nums) {
        SubSet subSet = new SubSet(nums);

        for (int i = 0; i < nums.length; i++) {
            subSet.wholeSet(i);

        }
        return subSet.result;
    }


    static class SubSet {
        List<List<Integer>> result = new ArrayList<>();
        private List<Integer> list = new ArrayList<>();
        List<Integer> source = new ArrayList<>();

        public SubSet(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                source.add(arr[i]);
            }
        }

        public void dfs(int i, List<Integer> list, List<Integer> li, List<List<Integer>> result) {

            if (i > list.size() - 1) {
                System.out.println(li);
                result.add(new ArrayList<>(li));
            } else {
                li.add(list.get(i));//左加
                dfs(i + 1, list, li, result); //递归方法
                li.remove(list.get(i)); //右去
                dfs(i + 1, list, li, result);
            }
        }

        private void wholeSet(int index) {
            dfs(index, list, source, result);
        }
    }


    public static int hammingDistance(int x, int y) {

        return 1;
    }


    public static int uniquePathsIII(int[][] grid) {

        int count = 0;


        return count;
    }

    static class UniquePath {
        private int count;
        private int[][] path;

        public UniquePath(int[][] grid) {

            this.path = grid;
        }


        private void findPath(int x, int y) {
            if (x < 0 || y < 0) return;
            if (x > path.length - 1 || y > path[0].length - 1) return;

            //
            if (path[x][y] == -1) return;

            if (path[x][y] == 1) {
                count++;
            } else {

            }


        }
    }


    /**
     * N皇后
     *
     * @see <a href="https://leetcode-cn.com/problems/n-queens-ii/">N皇后<a/>
     */
    static class Queen {
        private int num = 4;
        private int count = 0;


        private int[][] cell;//n*n的格子

        public Queen(int num) {
            this.num = num;
            cell = new int[num][num];

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    cell[i][j] = 0;
                }
            }
        }

        private void find(int row) {

            if (row > num - 1) {
                //遍历完了
                printResult();
                count++;
            } else {

                for (int column = 0; column < num; column++) {
                    if (adjust(row, column)) {
                        cell[row][column] = 1;
                        find(row + 1);
                        cell[row][column] = 0;
                    }
                }

            }

        }

        private boolean adjust(int row, int column) {

            //行
            for (int i = 0; i < num; i++) {
                if (cell[i][column] == 1) {
                    return false;
                }
            }

            //列
            for (int i = 0; i < num; i++) {
                if (cell[row][i] == 1) {
                    return false;
                }
            }

            //左对角线

            for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
                if (cell[i][j] == 1) {
                    return false;
                }
            }

            //右对角线

            for (int i = row - 1, j = column + 1; i >= 0 && j <= num - 1; i--, j++) {
                if (cell[i][j] == 1) {
                    return false;
                }
            }

            return true;
        }

        private void printResult() {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (cell[i][j] == 1) {
                        System.out.print("Q");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static boolean isChar(char ch) {
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            return true;
        } else return false;
    }


    /**
     * https://leetcode-cn.com/problems/non-decreasing-array/
     * 非递减数列
     *
     * @param nums
     * @return
     */
    public boolean checkPossibility(int[] nums) {

        if (nums == null || nums.length <= 2) {
            return true;
        }

        int change = 0;
        for (int i = 1; i < nums.length && change < 2; i++) {
            if (nums[i - 1] <= nums[i]) {
                continue;
            }
            change++;
            if (i - 2 > 0 && nums[i - 2] > nums[i]) {
                nums[i] = nums[i - 1];
            } else {
                nums[i - 1] = nums[i];
            }
        }
        return change <= 1;
    }

    /**
     * 605. 种花问题
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) i += 1;
            else if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1) || flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count += 1;
                i += 1;
            }
        }
        return count >= n;
    }

    /**
     * 最后一个单词的长度
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int start = s.lastIndexOf(" ") + 1;
        return s.substring(start).length();
    }

    /**
     * 换零钱
     * https://leetcode-cn.com/problems/coin-change/
     *
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin < 0) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return (dp[amount] > amount) ? -1 : dp[amount];

    }


    /**
     * 换零钱2
     * https://leetcode-cn.com/problems/coin-change-2/
     *
     * @param amount
     * @param coins
     * @return 题解：amount
     */
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j < amount + 1; j++) {
                dp[j] += dp[j - coin];
            }
        }
        return dp[amount];
    }

    /**
     * https://leetcode-cn.com/problems/is-subsequence/
     * 判断子序列
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        int m = s.length(), n = t.length();
        while (i < m && j < n) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == m;
    }

    /**
     * https://leetcode-cn.com/problems/count-primes/
     * 计数质数
     *
     * @param n
     * @return
     */
    public static int countPrimes(int n) {

        int count = 0;
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrimes[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    isPrimes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) count++;
        }

        return count;
    }

    /**
     * https://leetcode-cn.com/problems/super-egg-drop/
     * 扔鸡蛋
     *
     * @param K 鸡蛋个数
     * @param N 楼层数
     * @return
     */


    public static int superEggDrop(int K, int N) {
        return dp(K, N);
    }

    private static int dp(int k, int n) {
        if (k == 1) return n;
        if (n == 0) return 0;

//        int res = Integer.MAX_VALUE;
//        for (int i = 1; i <= n; i++) {
//            res = Math.min(res, Math.max(dp(k - 1, i - 1), dp(k, n - i)) + 1);
//        }
        int low=1 , high = n, res = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            int broken = dp(k - 1, mid - 1);//碎了
            int noBroken = dp(k, n - mid);//没碎
            if (broken > noBroken) {
                high = mid - 1;
                res = Math.min(res, broken + 1);
            } else {
                low = mid + 1;
                res = Math.min(res, noBroken + 1);
            }
        }
        return res;
    }


}
