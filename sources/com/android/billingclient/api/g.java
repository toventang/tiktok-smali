package com.android.billingclient.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f5837a;

    /* renamed from: b  reason: collision with root package name */
    public String f5838b;

    /* renamed from: c  reason: collision with root package name */
    public String f5839c;

    /* renamed from: d  reason: collision with root package name */
    public String f5840d;

    /* renamed from: e  reason: collision with root package name */
    public String f5841e;

    /* renamed from: f  reason: collision with root package name */
    public int f5842f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<SkuDetails> f5843g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5844h;

    static {
        Covode.recordClassIndex(2445);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5845a;

        /* renamed from: b  reason: collision with root package name */
        public String f5846b;

        /* renamed from: c  reason: collision with root package name */
        private String f5847c;

        /* renamed from: d  reason: collision with root package name */
        private String f5848d;

        /* renamed from: e  reason: collision with root package name */
        private int f5849e;

        /* renamed from: f  reason: collision with root package name */
        private ArrayList<SkuDetails> f5850f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f5851g;

        static {
            Covode.recordClassIndex(2446);
        }

        private a() {
        }

        public final g a() {
            ArrayList<SkuDetails> arrayList = this.f5850f;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.f5850f;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                SkuDetails skuDetails = arrayList2.get(i2);
                i2++;
                if (skuDetails == null) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            }
            if (this.f5850f.size() > 1) {
                SkuDetails skuDetails2 = this.f5850f.get(0);
                String c2 = skuDetails2.c();
                ArrayList<SkuDetails> arrayList3 = this.f5850f;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    SkuDetails skuDetails3 = arrayList3.get(i3);
                    i3++;
                    if (!c2.equals(skuDetails3.c())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String b2 = skuDetails2.b();
                if (TextUtils.isEmpty(b2)) {
                    ArrayList<SkuDetails> arrayList4 = this.f5850f;
                    int size3 = arrayList4.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        SkuDetails skuDetails4 = arrayList4.get(i4);
                        i4++;
                        if (!TextUtils.isEmpty(skuDetails4.b())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                } else {
                    ArrayList<SkuDetails> arrayList5 = this.f5850f;
                    int size4 = arrayList5.size();
                    int i5 = 0;
                    while (i5 < size4) {
                        SkuDetails skuDetails5 = arrayList5.get(i5);
                        i5++;
                        if (!b2.equals(skuDetails5.b())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            g gVar = new g((byte) 0);
            gVar.f5837a = null;
            gVar.f5838b = this.f5845a;
            gVar.f5841e = this.f5846b;
            gVar.f5839c = this.f5847c;
            gVar.f5840d = this.f5848d;
            gVar.f5842f = this.f5849e;
            gVar.f5843g = this.f5850f;
            gVar.f5844h = this.f5851g;
            return gVar;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.f5850f = arrayList;
            return this;
        }
    }

    private g() {
    }

    public static a b() {
        return new a((byte) 0);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        boolean z;
        ArrayList<SkuDetails> arrayList = this.f5843g;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = true;
                break;
            }
            SkuDetails skuDetails = arrayList.get(i2);
            i2++;
            if (skuDetails.b().isEmpty()) {
                z = false;
                break;
            }
        }
        if (!this.f5844h && this.f5838b == null && this.f5837a == null && this.f5841e == null && this.f5842f == 0 && !z) {
            return false;
        }
        return true;
    }

    /* synthetic */ g(byte b2) {
        this();
    }
}
