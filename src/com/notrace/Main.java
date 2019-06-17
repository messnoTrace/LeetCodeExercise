package com.notrace;


import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

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
        diStringMatch("III");

    }

    /**
     *
     * @param S
     * see<a href="https://leetcode-cn.com/problems/di-string-match/submissions/">增减字符串</>
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
}
