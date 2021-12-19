package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.repo.RegionApi;
import com.ss.android.ugc.aweme.lancet.j;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.k.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class DistrictPickerViewModel extends JediViewModel<DistrictPickerState> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ i[] f87683a = {new r(DistrictPickerViewModel.class, "numberOfRemainingLevel", "getNumberOfRemainingLevel()I", 0), new r(DistrictPickerViewModel.class, "parentId", "getParentId()I", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f87684k = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String[] f87685b;

    /* renamed from: c  reason: collision with root package name */
    public OrderSKUDTO f87686c;

    /* renamed from: d  reason: collision with root package name */
    public final h.h.e f87687d = h.h.a.a();

    /* renamed from: e  reason: collision with root package name */
    public final h.h.e f87688e = h.h.a.a();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<Region> f87689f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f87690g;

    static {
        Covode.recordClassIndex(55151);
    }

    public final int a() {
        return ((Number) this.f87687d.a(this, f87683a[0])).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55152);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean b() {
        if (!this.f87690g || a() <= 0) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ DistrictPickerState d() {
        return new DistrictPickerState(null, null, null, null, 0, 31, null);
    }

    private static boolean i() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean h2 = h();
        j.f107226e = h2;
        return h2;
    }

    public final void g() {
        if (!i()) {
            a(2);
            return;
        }
        a(0);
        RegionApi.a.a(this.f87685b, this.f87686c).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DistrictPickerViewModel f87692a;

        static {
            Covode.recordClassIndex(55155);
        }

        c(DistrictPickerViewModel districtPickerViewModel) {
            this.f87692a = districtPickerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f87692a.a(3);
        }
    }

    public final void a(int i2) {
        c(new e(i2));
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<DistrictPickerState, DistrictPickerState> {
        final /* synthetic */ int $status;

        static {
            Covode.recordClassIndex(55157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(int i2) {
            super(1);
            this.$status = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DistrictPickerState invoke(DistrictPickerState districtPickerState) {
            DistrictPickerState districtPickerState2 = districtPickerState;
            l.d(districtPickerState2, "");
            return DistrictPickerState.copy$default(districtPickerState2, null, null, null, null, this.$status, 15, null);
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DistrictPickerViewModel f87691a;

        static {
            Covode.recordClassIndex(55153);
        }

        b(DistrictPickerViewModel districtPickerViewModel) {
            this.f87691a = districtPickerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            final T t = aVar.data;
            if (!aVar.isCodeOK() || t == null) {
                this.f87691a.a(3);
                return;
            }
            DistrictPickerViewModel districtPickerViewModel = this.f87691a;
            Boolean bool = t.f87675b;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            districtPickerViewModel.f87690g = z;
            this.f87691a.c(new h.f.a.b<DistrictPickerState, DistrictPickerState>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerViewModel.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(55154);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ DistrictPickerState invoke(DistrictPickerState districtPickerState) {
                    DistrictPickerState districtPickerState2 = districtPickerState;
                    l.d(districtPickerState2, "");
                    List list = t.f87674a;
                    if (list == null) {
                        list = z.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.size() > 4) {
                        String str = "";
                        for (T t : list) {
                            String str2 = t.f87673c;
                            if (str2 != null) {
                                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                                String upperCase = str2.toUpperCase();
                                l.b(upperCase, "");
                                if (upperCase != null && (!l.a((Object) upperCase, (Object) str))) {
                                    arrayList.add(upperCase);
                                    str = upperCase;
                                }
                            }
                            arrayList.add(t);
                        }
                    } else {
                        arrayList.addAll(list);
                    }
                    String str3 = t.f87676c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = t.f87677d;
                    if (str4 == null) {
                        str4 = "";
                    }
                    return DistrictPickerState.copy$default(districtPickerState2, str3, str4, arrayList, null, -1, 8, null);
                }
            });
        }
    }

    public static final class d extends m implements h.f.a.b<DistrictPickerState, DistrictPickerState> {
        final /* synthetic */ District $district;

        static {
            Covode.recordClassIndex(55156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(District district) {
            super(1);
            this.$district = district;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ DistrictPickerState invoke(DistrictPickerState districtPickerState) {
            DistrictPickerState districtPickerState2 = districtPickerState;
            l.d(districtPickerState2, "");
            District district = this.$district;
            return DistrictPickerState.copy$default(districtPickerState2, null, null, null, new District(district.f87671a, district.f87672b, district.f87673c), 0, 23, null);
        }
    }

    public final ArrayList<Region> a(District district) {
        l.d(district, "");
        ArrayList<Region> arrayList = new ArrayList<>(this.f87689f);
        arrayList.add(new Region(district.f87671a, district.f87672b, null, 4));
        return arrayList;
    }
}
