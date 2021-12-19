package org.apache.commons.logging;

import com.bytedance.covode.number.Covode;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public abstract class LogFactory {
    static /* synthetic */ Class class$java$lang$Thread;
    static /* synthetic */ Class class$org$apache$commons$logging$LogFactory;
    private static String diagnosticPrefix;
    private static PrintStream diagnosticsStream;
    protected static Hashtable factories = createFactoryStore();
    protected static LogFactory nullClassLoaderFactory;
    private static ClassLoader thisClassLoader;

    public abstract Log getInstance(Class cls);

    public abstract void setAttribute(String str, Object obj);

    protected LogFactory() {
    }

    protected static boolean isDiagnosticsEnabled() {
        if (diagnosticsStream != null) {
            return true;
        }
        return false;
    }

    private static ClassLoader getContextClassLoaderInternal() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            /* class org.apache.commons.logging.LogFactory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106353);
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    static {
        Covode.recordClassIndex(106352);
        Class cls = class$org$apache$commons$logging$LogFactory;
        if (cls == null) {
            cls = class$("org.apache.commons.logging.LogFactory");
            class$org$apache$commons$logging$LogFactory = cls;
        }
        thisClassLoader = getClassLoader(cls);
        initDiagnostics();
        Class cls2 = class$org$apache$commons$logging$LogFactory;
        if (cls2 == null) {
            cls2 = class$("org.apache.commons.logging.LogFactory");
            class$org$apache$commons$logging$LogFactory = cls2;
        }
        logClassLoaderEnvironment(cls2);
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    private static final Hashtable createFactoryStore() {
        String str;
        Hashtable hashtable = null;
        try {
            str = getSystemProperty("org.apache.commons.logging.LogFactory.HashtableImpl", null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "org.apache.commons.logging.impl.WeakHashtable";
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable unused2) {
            if (!"org.apache.commons.logging.impl.WeakHashtable".equals(str)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        if (hashtable == null) {
            return new Hashtable();
        }
        return hashtable;
    }

    public static ClassLoader directGetContextClassLoader() {
        ClassLoader classLoader = null;
        try {
            Class cls = class$java$lang$Thread;
            if (cls == null) {
                cls = class$("java.lang.Thread");
                class$java$lang$Thread = cls;
            }
            try {
                classLoader = (ClassLoader) cls.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
                return classLoader;
            } catch (IllegalAccessException e2) {
                throw new LogConfigurationException("Unexpected IllegalAccessException", e2);
            } catch (InvocationTargetException e3) {
                if (e3.getTargetException() instanceof SecurityException) {
                    return classLoader;
                }
                throw new LogConfigurationException("Unexpected InvocationTargetException", e3.getTargetException());
            }
        } catch (NoSuchMethodException unused) {
            Class cls2 = class$org$apache$commons$logging$LogFactory;
            if (cls2 == null) {
                cls2 = class$("org.apache.commons.logging.LogFactory");
                class$org$apache$commons$logging$LogFactory = cls2;
            }
            return getClassLoader(cls2);
        }
    }

    private static void initDiagnostics() {
        String str;
        try {
            String systemProperty = getSystemProperty("org.apache.commons.logging.diagnostics.dest", null);
            if (systemProperty != null) {
                if (systemProperty.equals("STDOUT")) {
                    diagnosticsStream = System.out;
                } else if (systemProperty.equals("STDERR")) {
                    diagnosticsStream = System.err;
                } else {
                    diagnosticsStream = new PrintStream(new FileOutputStream(systemProperty, true));
                }
                try {
                    ClassLoader classLoader = thisClassLoader;
                    if (classLoader == null) {
                        str = "BOOTLOADER";
                    } else {
                        str = objectId(classLoader);
                    }
                } catch (SecurityException unused) {
                    str = "UNKNOWN";
                }
                diagnosticPrefix = new StringBuffer("[LogFactory from ").append(str).append("] ").toString();
            }
        } catch (SecurityException unused2) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0149, code lost:
        if (r4 == null) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (r4 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c5, code lost:
        if (r4 != null) goto L_0x01c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.apache.commons.logging.LogFactory getFactory() {
        /*
        // Method dump skipped, instructions count: 509
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getFactory():org.apache.commons.logging.LogFactory");
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e2) {
            throw new NoClassDefFoundError(e2.getMessage());
        }
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        if (classLoader == null) {
            return nullClassLoaderFactory;
        }
        return (LogFactory) factories.get(classLoader);
    }

    public static Log getLog(Class cls) {
        return getFactory().getInstance(cls);
    }

    private static Properties getProperties(final URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction() {
            /* class org.apache.commons.logging.LogFactory.AnonymousClass5 */

            static {
                Covode.recordClassIndex(106357);
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    InputStream openStream = url.openStream();
                    if (openStream == null) {
                        return null;
                    }
                    Properties properties = new Properties();
                    properties.load(openStream);
                    openStream.close();
                    return properties;
                } catch (IOException unused) {
                    if (!LogFactory.isDiagnosticsEnabled()) {
                        return null;
                    }
                    LogFactory.logDiagnostic(new StringBuffer("Unable to read URL ").append(url).toString());
                    return null;
                }
            }
        });
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static final void logDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    protected static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e2) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("Unable to get classloader for class '").append(cls).append("' due to security restrictions - ").append(e2.getMessage()).toString());
            }
            throw e2;
        }
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        return new StringBuffer().append(obj.getClass().getName()).append("@").append(System.identityHashCode(obj)).toString();
    }

    private static boolean implementsLogFactory(Class cls) {
        boolean z = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    z = Class.forName("org.apache.commons.logging.LogFactory", false, classLoader).isAssignableFrom(cls);
                    if (z) {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" implements LogFactory but was loaded by an incompatible classloader.").toString());
                    } else {
                        logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] ").append(cls.getName()).append(" does not implement LogFactory.").toString());
                    }
                }
            } catch (SecurityException e2) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e2.getMessage()).toString());
            } catch (LinkageError e3) {
                logDiagnostic(new StringBuffer("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ").append(e3.getMessage()).toString());
            } catch (ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            }
        }
        return z;
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                logDiagnostic(new StringBuffer("[ENV] Extension directories (java.ext.dir): ").append(System.getProperty("java.ext.dir")).toString());
                logDiagnostic(new StringBuffer("[ENV] Application classpath (java.class.path): ").append(System.getProperty("java.class.path")).toString());
            } catch (SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                logDiagnostic(new StringBuffer("[ENV] Class ").append(name).append(" was loaded via classloader ").append(objectId(classLoader)).toString());
                logHierarchy(new StringBuffer("[ENV] Ancestry of classloader which loaded ").append(name).append(" is ").toString(), classLoader);
            } catch (SecurityException unused2) {
                logDiagnostic("[ENV] Security forbids determining the classloader for ".concat(String.valueOf(name)));
            }
        }
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory == null) {
            return;
        }
        if (classLoader == null) {
            nullClassLoaderFactory = logFactory;
        } else {
            factories.put(classLoader, logFactory);
        }
    }

    private static InputStream getResourceAsStream(final ClassLoader classLoader, final String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction() {
            /* class org.apache.commons.logging.LogFactory.AnonymousClass3 */

            static {
                Covode.recordClassIndex(106355);
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader classLoader = classLoader;
                if (classLoader != null) {
                    return classLoader.getResourceAsStream(str);
                }
                return ClassLoader.getSystemResourceAsStream(str);
            }
        });
    }

    private static Enumeration getResources(final ClassLoader classLoader, final String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction() {
            /* class org.apache.commons.logging.LogFactory.AnonymousClass4 */

            static {
                Covode.recordClassIndex(106356);
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    ClassLoader classLoader = classLoader;
                    if (classLoader != null) {
                        return classLoader.getResources(str);
                    }
                    return ClassLoader.getSystemResources(str);
                } catch (IOException e2) {
                    if (LogFactory.isDiagnosticsEnabled()) {
                        LogFactory.logDiagnostic(new StringBuffer("Exception while trying to find configuration file ").append(str).append(":").append(e2.getMessage()).toString());
                    }
                    return null;
                } catch (NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static String getSystemProperty(final String str, final String str2) {
        return (String) AccessController.doPrivileged(new PrivilegedAction() {
            /* class org.apache.commons.logging.LogFactory.AnonymousClass6 */

            static {
                Covode.recordClassIndex(106358);
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(str, str2);
            }
        });
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                logDiagnostic(new StringBuffer().append(str).append(objectId(classLoader)).append(" == '").append(classLoader.toString()).append("'").toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer = new StringBuffer(new StringBuffer().append(str).append("ClassLoader tree:").toString());
                    do {
                        stringBuffer.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer.append("BOOT");
                    logDiagnostic(stringBuffer.toString());
                }
            } catch (SecurityException unused2) {
                logDiagnostic(new StringBuffer().append(str).append("Security forbids determining the system classloader.").toString());
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x009d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.Object createFactory(java.lang.String r5, java.lang.ClassLoader r6) {
        /*
        // Method dump skipped, instructions count: 468
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.createFactory(java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.Properties getConfigurationFile(java.lang.ClassLoader r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getConfigurationFile(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    protected static LogFactory newFactory(final String str, final ClassLoader classLoader, ClassLoader classLoader2) {
        Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction() {
            /* class org.apache.commons.logging.LogFactory.AnonymousClass2 */

            static {
                Covode.recordClassIndex(106354);
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.createFactory(str, classLoader);
            }
        });
        if (doPrivileged instanceof LogConfigurationException) {
            Throwable th = (Throwable) doPrivileged;
            if (isDiagnosticsEnabled()) {
                logDiagnostic(new StringBuffer("An error occurred while loading the factory class:").append(th.getMessage()).toString());
            }
            throw th;
        }
        if (isDiagnosticsEnabled()) {
            logDiagnostic(new StringBuffer("Created object ").append(objectId(doPrivileged)).append(" to manage classloader ").append(objectId(classLoader2)).toString());
        }
        return (LogFactory) doPrivileged;
    }
}
