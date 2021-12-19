package com.airbnb.epoxy;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class n {
    private static final ak NO_OP_TIMER = new ad();
    public static Handler defaultDiffingHandler = ab.f4994b.f5106a;
    public static Handler defaultModelBuildingHandler = ab.f4994b.f5106a;
    private static boolean filterDuplicatesDefault = false;
    private static boolean globalDebugLoggingEnabled = false;
    private static a globalExceptionHandler = new a() {
        /* class com.airbnb.epoxy.n.AnonymousClass2 */

        static {
            Covode.recordClassIndex(2137);
        }
    };
    public final o adapter;
    private final Runnable buildModelsRunnable;
    private p debugObserver;
    private volatile boolean filterDuplicates;
    public volatile boolean hasBuiltModelsEver;
    public final f helper;
    private final List<b> interceptors;
    private final Handler modelBuildHandler;
    private List<c> modelInterceptorCallbacks;
    public h modelsBeingBuilt;
    public int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    public s<?> stagedModel;
    public volatile Thread threadBuildingModels;
    public ak timer;

    public interface a {
        static {
            Covode.recordClassIndex(2139);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(2140);
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(2141);
        }

        void a();

        void b();
    }

    /* access modifiers changed from: protected */
    public abstract void buildModels();

    public boolean isStickyHeader(int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    /* access modifiers changed from: protected */
    public void onExceptionSwallowed(RuntimeException runtimeException) {
    }

    /* access modifiers changed from: protected */
    public void onModelBound(u uVar, s<?> sVar, int i2, s<?> sVar2) {
    }

    /* access modifiers changed from: protected */
    public void onModelUnbound(u uVar, s<?> sVar) {
    }

    /* access modifiers changed from: protected */
    public void onViewAttachedToWindow(u uVar, s<?> sVar) {
    }

    /* access modifiers changed from: protected */
    public void onViewDetachedFromWindow(u uVar, s<?> sVar) {
    }

    public void setupStickyHeaderView(View view) {
    }

    public void teardownStickyHeaderView(View view) {
    }

    public o getAdapter() {
        return this.adapter;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public n() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    public int getSpanCount() {
        return this.adapter.f5032a;
    }

    public GridLayoutManager.c getSpanSizeLookup() {
        return this.adapter.f5035d;
    }

    public boolean isMultiSpan() {
        return this.adapter.d();
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new y("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new y("Cannot call this from inside `buildModels`");
        }
    }

    /* access modifiers changed from: package-private */
    public void addCurrentlyStagedModelIfExists() {
        s<?> sVar = this.stagedModel;
        if (sVar != null) {
            sVar.a(this);
        }
        this.stagedModel = null;
    }

    public int getExpectedModelCount() {
        int itemCount = this.adapter.getItemCount();
        if (itemCount != 0) {
            return itemCount;
        }
        return 25;
    }

    /* access modifiers changed from: protected */
    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    /* access modifiers changed from: protected */
    public boolean isBuildingModels() {
        if (this.threadBuildingModels == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public boolean isDebugLoggingEnabled() {
        if (this.timer != NO_OP_TIMER) {
            return true;
        }
        return false;
    }

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    public boolean hasPendingModelBuild() {
        if (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.f5061f.f5015d.c()) {
            return false;
        }
        return true;
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new y("Cannot call `requestModelBuild` from inside `buildModels`");
        } else if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    static {
        Covode.recordClassIndex(2135);
    }

    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<c> list = this.modelInterceptorCallbacks;
            if (list != null) {
                for (c cVar : list) {
                    cVar.a();
                }
            }
            this.timer.a("Interceptors executed");
            Iterator<b> it = this.interceptors.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.timer.a();
            List<c> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                for (c cVar2 : list2) {
                    cVar2.b();
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(a aVar) {
        globalExceptionHandler = aVar;
    }

    public void add(s<?> sVar) {
        sVar.a(this);
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void addInterceptor(b bVar) {
        this.interceptors.add(bVar);
    }

    public void addModelBuildListener(ag agVar) {
        this.adapter.f5063h.add(agVar);
    }

    public void removeInterceptor(b bVar) {
        this.interceptors.remove(bVar);
    }

    public void removeModelBuildListener(ag agVar) {
        this.adapter.f5063h.remove(agVar);
    }

    public void setSpanCount(int i2) {
        this.adapter.f5032a = i2;
    }

    /* access modifiers changed from: package-private */
    public void clearModelFromStaging(s<?> sVar) {
        if (this.stagedModel != sVar) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    /* access modifiers changed from: package-private */
    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void setStagedModel(s<?> sVar) {
        if (sVar != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = sVar;
    }

    /* access modifiers changed from: protected */
    public void add(s<?>... sVarArr) {
        h hVar = this.modelsBeingBuilt;
        hVar.ensureCapacity(hVar.size() + sVarArr.length);
        for (s<?> sVar : sVarArr) {
            add(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void addAfterInterceptorCallback(c cVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(cVar);
    }

    /* access modifiers changed from: package-private */
    public int getFirstIndexOfModelInBuildingList(s<?> sVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == sVar) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean isModelAddedMultipleTimes(s<?> sVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (this.modelsBeingBuilt.get(i3) == sVar) {
                i2++;
            }
        }
        if (i2 > 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i2 = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i2;
        if (i2 > 1) {
            ab.f4994b.f5106a.postDelayed(new Runnable() {
                /* class com.airbnb.epoxy.n.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(2138);
                }

                public final void run() {
                    if (n.this.recyclerViewAttachCount > 1) {
                        n.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
                    }
                }
            }, 3000);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    /* access modifiers changed from: protected */
    public void add(List<? extends s<?>> list) {
        h hVar = this.modelsBeingBuilt;
        hVar.ensureCapacity(hVar.size() + list.size());
        for (s<?> sVar : list) {
            add(sVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void addInternal(s<?> sVar) {
        assertIsBuildingModels();
        if (sVar.f5083g) {
            throw new y("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        } else if (sVar.f5078b) {
            clearModelFromStaging(sVar);
            sVar.f5080d = null;
            this.modelsBeingBuilt.add(sVar);
        } else {
            throw new y("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        o oVar = this.adapter;
        if (oVar.f5033b.f5038a.b() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        } else if (bundle != null) {
            oVar.f5034c = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            if (oVar.f5034c == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        o oVar = this.adapter;
        Iterator<u> it = oVar.f5033b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        if (oVar.f5034c.b() <= 0 || oVar.mHasStableIds) {
            bundle.putParcelable("saved_state_view_holders", oVar.f5034c);
            return;
        }
        throw new IllegalStateException("Must have stable ids when saving view holder state");
    }

    public synchronized void requestDelayedModelBuild(int i2) {
        if (!isBuildingModels()) {
            int i3 = 1;
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            if (i2 != 0) {
                i3 = 2;
            }
            this.requestedModelBuildType = i3;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, (long) i2);
            return;
        }
        throw new y("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new i(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new p(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        p pVar = this.debugObserver;
        if (pVar != null) {
            this.adapter.unregisterAdapterDataObserver(pVar);
        }
    }

    public void filterDuplicatesIfNeeded(List<s<?>> list) {
        if (this.filterDuplicates) {
            this.timer.a("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<s<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                s<?> next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.f5077a))) {
                    int previousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    s<?> sVar = list.get(findPositionOfDuplicate);
                    if (previousIndex <= findPositionOfDuplicate) {
                        findPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new y("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + sVar + "\nDuplicate has position " + previousIndex + ":\n" + next));
                }
            }
            this.timer.a();
        }
    }

    public n(Handler handler, Handler handler2) {
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        this.helper = g.a(this);
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new Runnable() {
            /* class com.airbnb.epoxy.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2136);
            }

            public final void run() {
                n.this.threadBuildingModels = Thread.currentThread();
                n.this.cancelPendingModelBuild();
                n.this.helper.resetAutoModels();
                n.this.modelsBeingBuilt = new h(n.this.getExpectedModelCount());
                n.this.timer.a("Models built");
                try {
                    n.this.buildModels();
                    n.this.addCurrentlyStagedModelIfExists();
                    n.this.timer.a();
                    n.this.runInterceptors();
                    n nVar = n.this;
                    nVar.filterDuplicatesIfNeeded(nVar.modelsBeingBuilt);
                    h hVar = n.this.modelsBeingBuilt;
                    hVar.observer = h.f5043a;
                    if (hVar.notificationsPaused) {
                        hVar.notificationsPaused = false;
                        n.this.timer.a("Models diffed");
                        n.this.adapter.a(n.this.modelsBeingBuilt);
                        n.this.timer.a();
                        n.this.modelsBeingBuilt = null;
                        n.this.hasBuiltModelsEver = true;
                        n.this.threadBuildingModels = null;
                        return;
                    }
                    throw new IllegalStateException("Notifications already resumed");
                } catch (Throwable th) {
                    n.this.timer.a();
                    n.this.modelsBeingBuilt = null;
                    n.this.hasBuiltModelsEver = true;
                    n.this.threadBuildingModels = null;
                    n.this.stagedModel = null;
                    throw th;
                }
            }
        };
        this.adapter = new o(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    private int findPositionOfDuplicate(List<s<?>> list, s<?> sVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).f5077a == sVar.f5077a) {
                return i2;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    public void moveModel(int i2, int i3) {
        assertNotBuildingModels();
        o oVar = this.adapter;
        ArrayList arrayList = new ArrayList(oVar.f5061f.f5017f);
        arrayList.add(i3, arrayList.remove(i2));
        oVar.f5060e.f5008a = true;
        oVar.notifyItemMoved(i2, i3);
        oVar.f5060e.f5008a = false;
        if (oVar.f5061f.a(arrayList)) {
            oVar.f5062g.requestModelBuild();
        }
        requestDelayedModelBuild(500);
    }
}
