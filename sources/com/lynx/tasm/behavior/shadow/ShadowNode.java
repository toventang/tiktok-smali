package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.c;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.a;
import java.util.ArrayList;
import java.util.Map;

public class ShadowNode extends LayoutNode {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<ShadowNode> f55956a;

    /* renamed from: h  reason: collision with root package name */
    public int f55957h;

    /* renamed from: i  reason: collision with root package name */
    public String f55958i;

    /* renamed from: j  reason: collision with root package name */
    public ShadowNode f55959j;

    /* renamed from: k  reason: collision with root package name */
    protected j f55960k;

    /* renamed from: l  reason: collision with root package name */
    public i f55961l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f55962m;
    protected Map<String, a> n;
    protected boolean o;

    static {
        Covode.recordClassIndex(34959);
    }

    public void a(PaintingContext paintingContext) {
    }

    public void a(int[] iArr, double[] dArr, String str) {
    }

    public boolean a() {
        return false;
    }

    public void g() {
    }

    public String toString() {
        return this.f55958i;
    }

    public final String e() {
        return (String) c.a(this.f55958i);
    }

    public final int f() {
        ArrayList<ShadowNode> arrayList = this.f55956a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final j h() {
        return (j) c.a(this.f55960k);
    }

    @Override // com.lynx.tasm.behavior.shadow.LayoutNode
    public final void d() {
        ShadowNode shadowNode = this;
        while (!shadowNode.f55962m) {
            if (!shadowNode.a()) {
                super.d();
                return;
            } else if (shadowNode.a()) {
                do {
                    shadowNode = shadowNode.f55959j;
                    if (shadowNode == null) {
                        return;
                    }
                } while (shadowNode.a());
            }
        }
    }

    @m(a = "ignore-focus")
    public void setIgnoreFocus(boolean z) {
        this.o = z;
    }

    public void a(j jVar) {
        this.f55960k = jVar;
    }

    public void b(v vVar) {
        PropsUpdater.a(this, vVar);
        g();
    }

    public final void a(v vVar) {
        PropsUpdater.a(this, vVar);
        g();
    }

    public final ShadowNode a(int i2) {
        ArrayList<ShadowNode> arrayList = this.f55956a;
        if (arrayList != null) {
            ShadowNode remove = arrayList.remove(i2);
            remove.f55959j = null;
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i2 + " out of bounds: node has no children");
    }

    public final ShadowNode b(int i2) {
        ArrayList<ShadowNode> arrayList = this.f55956a;
        if (arrayList != null) {
            return arrayList.get(i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i2 + " out of bounds: node has no children");
    }

    @m(a = "vertical-align")
    public void setVerticalAlign(ReadableArray readableArray) {
        if (this.f55961l == null) {
            this.f55961l = new i();
        }
        if (readableArray == null || readableArray.size() < 2) {
            this.f55961l.f55971a = 0;
            this.f55961l.f55972b = 0.0f;
            return;
        }
        this.f55961l.f55971a = readableArray.getInt(0);
        this.f55961l.f55972b = (float) readableArray.getDouble(1);
    }

    public void a(Map<String, a> map) {
        this.n = map;
    }

    public void a(ShadowNode shadowNode, int i2) {
        if (shadowNode.f55959j == null) {
            if (this.f55956a == null) {
                this.f55956a = new ArrayList<>(4);
            }
            this.f55956a.add(i2, shadowNode);
            shadowNode.f55959j = this;
            return;
        }
        throw new RuntimeException("Tried to add child that already has a parent! Remove it from its parent first.");
    }
}
