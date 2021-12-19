package com.ss.android.ugc.aweme.ecommerce.preloader;

import android.util.SparseIntArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.e;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.f;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SalePropValue;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImagePreloadExperiment {
    private static final int BIT_PDP_DETAIL = 4;
    private static final int BIT_PDP_HEADER = 2;
    private static final int BIT_SKU = 1;
    public static final ImagePreloadExperiment INSTANCE = new ImagePreloadExperiment();
    public static final ImagePreloadConfig NONE = new ImagePreloadConfig();
    private static final int PRIORITY_DEFAULT = 100000;
    private static final int PRIORITY_START = 10;
    private static final int PRIORITY_STEP = 1000;
    private static final h config$delegate = i.a((h.f.a.a) a.f86940a);
    private static final h options$delegate = i.a((h.f.a.a) b.f86941a);
    private static final h priorities$delegate = i.a((h.f.a.a) c.f86942a);

    private final List<Integer> getOptions() {
        return (List) options$delegate.getValue();
    }

    private final SparseIntArray getPriorities() {
        return (SparseIntArray) priorities$delegate.getValue();
    }

    public final ImagePreloadConfig getConfig() {
        return (ImagePreloadConfig) config$delegate.getValue();
    }

    private ImagePreloadExperiment() {
    }

    static final class a extends m implements h.f.a.a<ImagePreloadConfig> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f86940a = new a();

        static {
            Covode.recordClassIndex(54502);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImagePreloadConfig invoke() {
            Object a2 = com.bytedance.ies.abmock.b.a().a(true, "ecom_schema_image_prefetch_config", ImagePreloadConfig.class, ImagePreloadExperiment.NONE);
            if (a2 != null) {
                return a2;
            }
            ImagePreloadExperiment imagePreloadExperiment = ImagePreloadExperiment.INSTANCE;
            return ImagePreloadExperiment.NONE;
        }
    }

    static {
        Covode.recordClassIndex(54501);
    }

    static final class b extends m implements h.f.a.a<List<? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f86941a = new b();

        static {
            Covode.recordClassIndex(54503);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends Integer> invoke() {
            List b2 = n.b(1, 2, 4);
            ArrayList arrayList = new ArrayList();
            for (Object obj : b2) {
                if ((((Number) obj).intValue() & ImagePreloadExperiment.INSTANCE.getConfig().f86939b) != 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    static final class c extends m implements h.f.a.a<SparseIntArray> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f86942a = new c();

        static {
            Covode.recordClassIndex(54504);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SparseIntArray invoke() {
            SparseIntArray sparseIntArray = new SparseIntArray();
            List<Number> c2 = n.c(1, 2, 4);
            Iterator<T> it = ImagePreloadExperiment.INSTANCE.getConfig().f86938a.iterator();
            int i2 = 10;
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                c2.remove(Integer.valueOf(intValue));
                sparseIntArray.put(intValue, i2);
                i2 += ImagePreloadExperiment.PRIORITY_STEP;
            }
            for (Number number : c2) {
                sparseIntArray.put(number.intValue(), i2);
            }
            return sparseIntArray;
        }
    }

    public final void onFirstHeaderImageReady(androidx.lifecycle.i iVar, PdpViewModel pdpViewModel) {
        List<SaleProp> list;
        com.bytedance.lighten.a.a.a thumbFirstImageUrlModel;
        ProductBase productBase;
        List<Image> list2;
        List<Object> c2;
        ProductPackStruct productPackStruct;
        l.d(iVar, "");
        l.d(pdpViewModel, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getOptions().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (intValue == 1) {
                ProductPackStruct productPackStruct2 = pdpViewModel.f86303d;
                if (!(productPackStruct2 == null || (list = productPackStruct2.f86642f) == null)) {
                    ArrayList<SaleProp> arrayList2 = new ArrayList();
                    for (T t : list) {
                        if (l.a((Object) t.f87410c, (Object) true)) {
                            arrayList2.add(t);
                        }
                    }
                    for (SaleProp saleProp : arrayList2) {
                        List<SalePropValue> list3 = saleProp.f87411d;
                        if (list3 != null) {
                            Iterator<T> it2 = list3.iterator();
                            while (it2.hasNext()) {
                                Image image = it2.next().f87414c;
                                if (!(image == null || (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) == null)) {
                                    arrayList.addAll(thumbFirstImageUrlModel.f39811a);
                                }
                            }
                        }
                    }
                }
            } else if (intValue == 2) {
                ProductPackStruct productPackStruct3 = pdpViewModel.f86303d;
                if (!(productPackStruct3 == null || (productBase = productPackStruct3.f86641e) == null || (list2 = productBase.f86626d) == null || (c2 = n.c((Iterable) list2, 2)) == null)) {
                    for (Object obj : c2) {
                        arrayList.add(obj);
                    }
                }
            } else if (intValue == 4 && (productPackStruct = pdpViewModel.f86303d) != null) {
                for (T t2 : e.a(productPackStruct, true)) {
                    if (t2 instanceof f) {
                        arrayList.add(t2.f86459a);
                    }
                }
            }
            if (true ^ arrayList.isEmpty()) {
                d.a(iVar).a(arrayList, INSTANCE.getPriorities().get(intValue, PRIORITY_DEFAULT));
                arrayList.clear();
            }
        }
    }
}
