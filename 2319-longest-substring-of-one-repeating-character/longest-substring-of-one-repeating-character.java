class Solution {

    class Node {
        char lchar, rchar;
        int pLen, sLen, maxLen, len;

        Node() {}
    }

    Node[] tree;
    char[] arr;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {

        int n = s.length();
        arr = s.toCharArray();

        tree = new Node[4 * n];
        for (int i = 0; i < tree.length; i++)
            tree[i] = new Node();

        build(1, 0, n - 1);

        int k = queryIndices.length;
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            update(1, 0, n - 1, queryIndices[i], queryCharacters.charAt(i));
            ans[i] = tree[1].maxLen;
        }

        return ans;
    }

    void build(int idx, int l, int r) {

        if (l == r) {
            Node node = tree[idx];
            node.lchar = arr[l];
            node.rchar = arr[l];
            node.len = 1;
            node.pLen = 1;
            node.sLen = 1;
            node.maxLen = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(idx * 2, l, mid);
        build(idx * 2 + 1, mid + 1, r);

        merge(idx);
    }

    void update(int idx, int l, int r, int pos, char ch) {

        if (l == r) {
            arr[pos] = ch;
            Node node = tree[idx];
            node.lchar = ch;
            node.rchar = ch;
            node.pLen = 1;
            node.sLen = 1;
            node.maxLen = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (pos <= mid)
            update(idx * 2, l, mid, pos, ch);
        else
            update(idx * 2 + 1, mid + 1, r, pos, ch);

        merge(idx);
    }

    void merge(int idx) {

        Node left = tree[idx * 2];
        Node right = tree[idx * 2 + 1];
        Node cur = tree[idx];

        cur.len = left.len + right.len;

        cur.lchar = left.lchar;
        cur.rchar = right.rchar;

        cur.pLen = left.pLen;
        if (left.pLen == left.len && left.rchar == right.lchar)
            cur.pLen += right.pLen;

        cur.sLen = right.sLen;
        if (right.sLen == right.len && left.rchar == right.lchar)
            cur.sLen += left.sLen;

        cur.maxLen = Math.max(left.maxLen, right.maxLen);

        if (left.rchar == right.lchar)
            cur.maxLen = Math.max(cur.maxLen, left.sLen + right.pLen);
    }
}