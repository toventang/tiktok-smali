package com.squareup.a.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import k.aa;
import k.f;
import k.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f57775a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f57776b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f57777c = Charset.forName("UTF-8");

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(aa aaVar, TimeUnit timeUnit) {
        try {
            return a(aaVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(aa aaVar, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = aaVar.timeout().hasDeadline() ? aaVar.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        aaVar.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            f fVar = new f();
            while (aaVar.read(fVar, 2048) != -1) {
                fVar.v();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                aaVar.timeout().clearDeadline();
                return true;
            }
            aaVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                aaVar.timeout().clearDeadline();
                return false;
            }
            aaVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                aaVar.timeout().clearDeadline();
            } else {
                aaVar.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] a(Class<T> cls, T[] tArr, T[] tArr2) {
        List a2 = a((Object[]) tArr, (Object[]) tArr2);
        return (T[]) a2.toArray((Object[]) Array.newInstance((Class<?>) cls, a2.size()));
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean a(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    static {
        Covode.recordClassIndex(35983);
    }

    public static ThreadFactory b(final String str) {
        return new ThreadFactory() {
            /* class com.squareup.a.a.j.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f57779b = true;

            static {
                Covode.recordClassIndex(35984);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(this.f57779b);
                return thread;
            }
        };
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static String a(q qVar) {
        if (qVar.f57883e != q.a(qVar.f57879a)) {
            return qVar.f57882d + ":" + qVar.f57883e;
        }
        return qVar.f57882d;
    }

    public static String a(String str) {
        try {
            return i.of(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).hex();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static i a(i iVar) {
        try {
            return i.of(MessageDigest.getInstance("SHA-1").digest(iVar.toByteArray()));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static <T> List<T> a(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                T t2 = tArr2[i2];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public static void a(long j2, long j3) {
        if ((j3 | 0) < 0 || 0 > j2 || j2 - 0 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
