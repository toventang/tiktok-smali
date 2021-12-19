package com.ss.android.ugc.aweme.ecommerce.address.candinput;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.e;
import com.ss.android.ugc.aweme.ecommerce.address.dto.g;
import com.ss.android.ugc.aweme.ecommerce.address.dto.m;
import com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.address.edit.j;
import com.ss.android.ugc.aweme.ecommerce.util.h;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class CandHelper {

    /* renamed from: h  reason: collision with root package name */
    static final int f84267h;

    /* renamed from: i  reason: collision with root package name */
    static final int f84268i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f84269j = new a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    private static final int f84270m = 1;

    /* renamed from: a  reason: collision with root package name */
    PopupWindow f84271a;

    /* renamed from: b  reason: collision with root package name */
    public a f84272b;

    /* renamed from: c  reason: collision with root package name */
    public int f84273c = 1;

    /* renamed from: d  reason: collision with root package name */
    public String f84274d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f84275e = "";

    /* renamed from: f  reason: collision with root package name */
    public final Context f84276f;

    /* renamed from: g  reason: collision with root package name */
    public final EditText f84277g;

    /* renamed from: k  reason: collision with root package name */
    private RecyclerView f84278k;

    /* renamed from: l  reason: collision with root package name */
    private final b f84279l = new b(this, Looper.getMainLooper());

    public static final class a {
        static {
            Covode.recordClassIndex(52548);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CandHelper f84284a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84285b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f84286c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ EditText f84287d;

        static {
            Covode.recordClassIndex(52552);
        }

        d(CandHelper candHelper, AddressEditViewModel addressEditViewModel, String str, EditText editText) {
            this.f84284a = candHelper;
            this.f84285b = addressEditViewModel;
            this.f84286c = str;
            this.f84287d = editText;
        }

        public final void run() {
            AddressEditViewModel addressEditViewModel = this.f84285b;
            String str = this.f84286c;
            AnonymousClass1 r1 = new h.f.a.b<e, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(52553);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(e eVar) {
                    boolean z;
                    j jVar;
                    int i2;
                    List<com.ss.android.ugc.aweme.ecommerce.address.dto.d> list;
                    String str;
                    e eVar2 = eVar;
                    String str2 = "";
                    l.d(eVar2, str2);
                    CandHelper candHelper = this.this$0.f84284a;
                    EditText editText = this.this$0.f84287d;
                    String str3 = this.this$0.f84286c;
                    String str4 = null;
                    if (editText.hasFocus()) {
                        CandHelper candHelper2 = this.this$0.f84284a;
                        AddressEditViewModel addressEditViewModel = this.this$0.f84285b;
                        String str5 = this.this$0.f84286c;
                        List<com.ss.android.ugc.aweme.ecommerce.address.dto.d> list2 = eVar2.f84335a;
                        candHelper2.f84275e = eVar2.f84337c;
                        int i3 = 0;
                        if (list2 == null || list2.isEmpty()) {
                            candHelper2.b(addressEditViewModel, str5);
                        } else {
                            a aVar = candHelper2.f84272b;
                            if (aVar == null) {
                                l.a("mAdapter");
                            }
                            Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.ecommerce.address.dto.CandInputData>");
                            aVar.f84289a = ad.d(list2);
                            a aVar2 = candHelper2.f84272b;
                            if (aVar2 == null) {
                                l.a("mAdapter");
                            }
                            g gVar = eVar2.f84336b;
                            if (gVar == null || (str = gVar.f84340a) == null || str.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar2.f84290b = !z;
                            if (aVar2.f84290b && (list = aVar2.f84289a) != null) {
                                m[] mVarArr = new m[1];
                                if (gVar != null) {
                                    str4 = gVar.f84340a;
                                }
                                mVarArr[0] = new m(str4);
                                list.add(0, new com.ss.android.ugc.aweme.ecommerce.address.dto.d(-2, n.c(mVarArr)));
                            }
                            a aVar3 = candHelper2.f84272b;
                            if (aVar3 == null) {
                                l.a("mAdapter");
                            }
                            aVar3.notifyDataSetChanged();
                            PopupWindow popupWindow = candHelper2.f84271a;
                            if (popupWindow == null) {
                                l.a("mPopupWindow");
                            }
                            if (!popupWindow.isShowing()) {
                                PopupWindow popupWindow2 = candHelper2.f84271a;
                                if (popupWindow2 == null) {
                                    l.a("mPopupWindow");
                                }
                                EditText editText2 = candHelper2.f84277g;
                                if (l.a((Object) str5, (Object) "address")) {
                                    i2 = CandHelper.f84267h;
                                } else {
                                    i2 = -10;
                                }
                                if (l.a((Object) str5, (Object) "address")) {
                                    i3 = CandHelper.f84268i;
                                }
                                popupWindow2.showAsDropDown(editText2, i2, i3);
                            }
                            int a2 = candHelper2.a();
                            if (a2 > 0 && (jVar = this.this$0.f84285b.f84362l) != null) {
                                String str6 = this.this$0.f84286c;
                                jVar.f84459d = SystemClock.elapsedRealtime();
                                jVar.f84460e = a2;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.putAll(jVar.f84456a);
                                linkedHashMap.put("page_name", "shipping_address");
                                if (str6 != null) {
                                    str2 = str6;
                                }
                                linkedHashMap.put("drop_down_list_name", str2);
                                linkedHashMap.put("item_num", String.valueOf(a2));
                                com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_drop_down_list_show", linkedHashMap);
                            }
                        }
                    } else {
                        candHelper.b(null, str3);
                    }
                    return z.f158842a;
                }
            };
            l.d(r1, "");
            addressEditViewModel.b_(new AddressEditViewModel.g(addressEditViewModel, str, r1));
        }
    }

    public final int a() {
        int i2;
        a aVar = this.f84272b;
        if (aVar == null) {
            l.a("mAdapter");
        }
        List<com.ss.android.ugc.aweme.ecommerce.address.dto.d> list = aVar.f84289a;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        a aVar2 = this.f84272b;
        if (aVar2 == null) {
            l.a("mAdapter");
        }
        if (aVar2.f84290b) {
            return i2 - 1;
        }
        return i2;
    }

    static {
        Covode.recordClassIndex(52546);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f84267h = h.g.a.a(TypedValue.applyDimension(1, -5.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        f84268i = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
    }

    public static final class CustomLinearLayoutMgr extends LinearLayoutManager {
        static {
            Covode.recordClassIndex(52547);
        }

        public CustomLinearLayoutMgr(Context context) {
            l.d(context, "");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void a(Rect rect, int i2, int i3) {
            l.d(rect, "");
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            super.a(rect, i2, View.MeasureSpec.makeMeasureSpec(h.g.a.a(TypedValue.applyDimension(1, 260.0f, system.getDisplayMetrics())), Integer.MIN_VALUE));
        }
    }

    public static final /* synthetic */ a a(CandHelper candHelper) {
        a aVar = candHelper.f84272b;
        if (aVar == null) {
            l.a("mAdapter");
        }
        return aVar;
    }

    public static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CandHelper f84280a;

        static {
            Covode.recordClassIndex(52549);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            CandHelper candHelper = this.f84280a;
            if (candHelper.f84277g.hasFocus()) {
                message.getCallback().run();
            } else {
                candHelper.b(null, null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(CandHelper candHelper, Looper looper) {
            super(looper);
            this.f84280a = candHelper;
        }
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CandHelper f84281a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AddressEditViewModel f84282b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f84283c;

        static {
            Covode.recordClassIndex(52550);
        }

        static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.address.dto.c, z> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(52551);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.ecommerce.address.dto.c cVar) {
                Address address;
                com.ss.android.ugc.aweme.ecommerce.address.dto.c cVar2 = cVar;
                l.d(cVar2, "");
                AddressEditViewModel addressEditViewModel = this.this$0.f84282b;
                com.ss.android.ugc.aweme.ecommerce.address.dto.d dVar = cVar2.f84330b;
                if (dVar != null) {
                    address = dVar.f84333c;
                } else {
                    address = null;
                }
                addressEditViewModel.a(address);
                String str = cVar2.f84329a;
                if (!(str == null || str.length() == 0 || !(this.this$0.f84281a.f84276f instanceof androidx.fragment.app.e))) {
                    new com.bytedance.tux.g.b((Activity) this.this$0.f84281a.f84276f).a(cVar2.f84329a).b();
                }
                return z.f158842a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
        @Override // com.ss.android.ugc.aweme.ecommerce.address.candinput.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r13) {
            /*
            // Method dump skipped, instructions count: 257
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper.c.a(int):void");
        }

        c(CandHelper candHelper, AddressEditViewModel addressEditViewModel, String str) {
            this.f84281a = candHelper;
            this.f84282b = addressEditViewModel;
            this.f84283c = str;
        }
    }

    public CandHelper(Context context, EditText editText) {
        l.d(context, "");
        l.d(editText, "");
        this.f84276f = context;
        this.f84277g = editText;
    }

    public final void b(AddressEditViewModel addressEditViewModel, String str) {
        j jVar;
        PopupWindow popupWindow = this.f84271a;
        if (popupWindow == null) {
            l.a("mPopupWindow");
        }
        if (!(!popupWindow.isShowing() || addressEditViewModel == null || (jVar = addressEditViewModel.f84362l) == null)) {
            jVar.b(str);
        }
        PopupWindow popupWindow2 = this.f84271a;
        if (popupWindow2 == null) {
            l.a("mPopupWindow");
        }
        popupWindow2.dismiss();
    }

    public final void a(AddressEditViewModel addressEditViewModel, String str) {
        int i2;
        l.d(addressEditViewModel, "");
        RecyclerView recyclerView = new RecyclerView(this.f84276f);
        this.f84278k = recyclerView;
        recyclerView.a(new com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a(androidx.core.content.b.c(this.f84276f, R.color.b6), 0, com.bytedance.common.utility.n.b(this.f84276f, 12.0f), 2));
        RecyclerView recyclerView2 = this.f84278k;
        if (recyclerView2 == null) {
            l.a("mCandListView");
        }
        recyclerView2.setVerticalScrollBarEnabled(false);
        RecyclerView recyclerView3 = this.f84278k;
        if (recyclerView3 == null) {
            l.a("mCandListView");
        }
        if (l.a((Object) str, (Object) "address")) {
            int i3 = h.f87567a;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            i2 = i3 - h.g.a.a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
        } else {
            i2 = -2;
        }
        PopupWindow popupWindow = new PopupWindow((View) recyclerView3, i2, -2, false);
        this.f84271a = popupWindow;
        popupWindow.setInputMethodMode(1);
        PopupWindow popupWindow2 = this.f84271a;
        if (popupWindow2 == null) {
            l.a("mPopupWindow");
        }
        popupWindow2.setSoftInputMode(16);
        a aVar = new a();
        this.f84272b = aVar;
        c cVar = new c(this, addressEditViewModel, str);
        l.d(cVar, "");
        aVar.f84291c = cVar;
        RecyclerView recyclerView4 = this.f84278k;
        if (recyclerView4 == null) {
            l.a("mCandListView");
        }
        a aVar2 = this.f84272b;
        if (aVar2 == null) {
            l.a("mAdapter");
        }
        recyclerView4.setAdapter(aVar2);
        RecyclerView recyclerView5 = this.f84278k;
        if (recyclerView5 == null) {
            l.a("mCandListView");
        }
        CustomLinearLayoutMgr customLinearLayoutMgr = new CustomLinearLayoutMgr(this.f84276f);
        customLinearLayoutMgr.b(1);
        recyclerView5.setLayoutManager(customLinearLayoutMgr);
        PopupWindow popupWindow3 = this.f84271a;
        if (popupWindow3 == null) {
            l.a("mPopupWindow");
        }
        popupWindow3.setBackgroundDrawable(this.f84276f.getResources().getDrawable(R.drawable.ze));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r7.equals("address") != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r0.length() != 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.widget.EditText r6, java.lang.String r7, com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r8) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper.a(android.widget.EditText, java.lang.String, com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel):void");
    }
}
