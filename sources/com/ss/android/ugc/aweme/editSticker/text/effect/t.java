package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.NinePatchDiv;
import h.f.b.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final int f88593e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final a f88594f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<NinePatchDiv> f88595a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public List<NinePatchDiv> f88596b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public Rect f88597c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public int[] f88598d = new int[0];

    public static final class a {
        static {
            Covode.recordClassIndex(55754);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        static List<NinePatchDiv> a(List<NinePatchDiv> list, int i2) {
            ArrayList arrayList = new ArrayList();
            if (list == null || list.isEmpty()) {
                return arrayList;
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                NinePatchDiv ninePatchDiv = list.get(i3);
                if (i3 == 0) {
                    if (ninePatchDiv.getStart() != 0) {
                        arrayList.add(new NinePatchDiv(0, ninePatchDiv.getStart() - 1));
                    }
                } else if (i3 > 0) {
                    arrayList.add(new NinePatchDiv(list.get(i3 - 1).getEnd(), ninePatchDiv.getStart() - 1));
                }
                arrayList.add(new NinePatchDiv(ninePatchDiv.getStart(), ninePatchDiv.getEnd() - 1));
                if (i3 == list.size() - 1 && ninePatchDiv.getEnd() < i2) {
                    arrayList.add(new NinePatchDiv(ninePatchDiv.getEnd(), i2 - 1));
                }
            }
            return arrayList;
        }
    }

    static {
        Covode.recordClassIndex(55753);
    }

    public final byte[] a() {
        ByteBuffer order = ByteBuffer.allocate((this.f88595a.size() * 2 * 4) + 32 + (this.f88596b.size() * 2 * 4) + (this.f88598d.length * 4)).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) (this.f88595a.size() * 2));
        order.put((byte) (this.f88596b.size() * 2));
        order.put((byte) this.f88598d.length);
        order.putInt(0);
        order.putInt(0);
        order.putInt(this.f88597c.left);
        order.putInt(this.f88597c.right);
        order.putInt(this.f88597c.top);
        order.putInt(this.f88597c.bottom);
        order.putInt(0);
        for (NinePatchDiv ninePatchDiv : this.f88595a) {
            order.putInt(ninePatchDiv.getStart());
            order.putInt(ninePatchDiv.getEnd());
        }
        for (NinePatchDiv ninePatchDiv2 : this.f88596b) {
            order.putInt(ninePatchDiv2.getStart());
            order.putInt(ninePatchDiv2.getEnd());
        }
        for (int i2 : this.f88598d) {
            order.putInt(i2);
        }
        byte[] array = order.array();
        l.b(array, "");
        return array;
    }

    public final void a(Rect rect) {
        l.d(rect, "");
        this.f88597c = rect;
    }

    public final void a(int[] iArr) {
        l.d(iArr, "");
        this.f88598d = iArr;
    }
}
