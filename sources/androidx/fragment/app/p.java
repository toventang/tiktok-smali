package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

final class p extends q {
    static {
        Covode.recordClassIndex(1076);
    }

    p() {
    }

    @Override // androidx.fragment.app.q
    public final boolean a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.q
    public final Object b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.q
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    private static boolean a(Transition transition) {
        if (!a((List) transition.getTargetIds()) || !a((List) transition.getTargetNames()) || !a((List) transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.q
    public final void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.q
    public final void b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.q
    public final void c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                /* class androidx.fragment.app.p.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(1080);
                }

                public final Rect onGetEpicenter(Transition transition) {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            a(view, rect);
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                /* class androidx.fragment.app.p.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1077);
                }

                public final Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i2 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i2 < transitionCount) {
                    a(transitionSet.getTransitionAt(i2), arrayList);
                    i2++;
                }
            } else if (!a(transition) && a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i2 < size) {
                    transition.addTarget(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.q
    public final Object a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.q
    public final void b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            /* class androidx.fragment.app.p.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1078);
            }

            public final void onTransitionCancel(Transition transition) {
            }

            public final void onTransitionPause(Transition transition) {
            }

            public final void onTransitionResume(Transition transition) {
            }

            public final void onTransitionStart(Transition transition) {
            }

            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((View) arrayList.get(i2)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null) {
            if (transition2 != null) {
                transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
            }
        } else if (transition2 != null) {
            transition = transition2;
        } else {
            transition = null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.q
    public final void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                b((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i2 < size) {
                    transition.addTarget(arrayList2.get(i2));
                    i2++;
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        a(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            /* class androidx.fragment.app.p.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1079);
            }

            public final void onTransitionCancel(Transition transition) {
            }

            public final void onTransitionEnd(Transition transition) {
            }

            public final void onTransitionPause(Transition transition) {
            }

            public final void onTransitionResume(Transition transition) {
            }

            public final void onTransitionStart(Transition transition) {
                Object obj = obj2;
                if (obj != null) {
                    p.this.b(obj, arrayList, (ArrayList<View>) null);
                }
                Object obj2 = obj3;
                if (obj2 != null) {
                    p.this.b(obj2, arrayList2, (ArrayList<View>) null);
                }
                Object obj3 = obj4;
                if (obj3 != null) {
                    p.this.b(obj3, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }
}
