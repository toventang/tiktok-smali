package com.ss.avframework.livestreamv2.tinyjson;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class TreeNode<T> {
    private final List<TreeNode<T>> children;
    private T data;
    private final TreeNode<T> parent;

    static {
        Covode.recordClassIndex(100485);
    }

    public final List<TreeNode<T>> getChildren() {
        return this.children;
    }

    public final T getData() {
        return this.data;
    }

    public final TreeNode<T> getParent() {
        return this.parent;
    }

    public final void setData(T t) {
        l.c(t, "");
        this.data = t;
    }

    public TreeNode(T t, TreeNode<T> treeNode, List<TreeNode<T>> list) {
        l.c(t, "");
        l.c(list, "");
        this.data = t;
        this.parent = treeNode;
        this.children = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TreeNode(Object obj, TreeNode treeNode, List list, int i2, g gVar) {
        this(obj, treeNode, (i2 & 4) != 0 ? new ArrayList() : list);
    }
}
