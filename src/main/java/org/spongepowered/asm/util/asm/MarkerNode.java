/*
 * This file is part of Mixin, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.asm.util.asm;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.LabelNode;

/**
 * A label node used as a marker in the bytecode. Does not actually visit the
 * label when visited.
 */
<<<<<<<< HEAD:src/main/java/org/spongepowered/asm/util/asm/MarkerNode.java
public class MarkerNode extends LabelNode {
========
public class ContainerHandleModLauncherEx extends ContainerHandleModLauncher {

    /**
     * Container handle for secure jar resources offered by ModLauncher
     */
    static class SecureJarResource extends ContainerHandleURI {

        private SecureJar jar;

        public SecureJarResource(SecureJar resource) {
            super(resource.getPrimaryPath().toUri());
            this.jar = resource;
        }
        
        @Override
        public String getId() {
            String name = this.jar.name();
            int lastDotPos = name.lastIndexOf('.');
            if (lastDotPos > 0) {
                name = name.substring(0, lastDotPos);
            }
            return name;
        }
        
        @Override
        public String getDescription() {
            return this.jar.getRootPath().toAbsolutePath().toString();
        }

        public String getName() {
            return this.jar.name();
        }
        
        public Path getPath() {
            return this.jar.getPrimaryPath();
        }
        
        @Override
        public String toString() {
            return String.format("SecureJarResource(%s)", this.getName());
        }

    }

    public ContainerHandleModLauncherEx(String name) {
        super(name);
    }
>>>>>>>> main:src/modlauncher9/java/org/spongepowered/asm/launch/platform/container/ContainerHandleModLauncherEx.java
    
    /**
     * Marks the end of the initialiser in a constructor
     */
    public static final int INITIALISER_TAIL = 1;
    
    /**
     * Marks the start of the body in a constructor
     */
    public static final int BODY_START = 2;
    
    /**
     * The type for this marker
     */
    public final int type;

    public MarkerNode(int type) {
        super(null);
        this.type = type;
    }

    @Override
    public void accept(MethodVisitor methodVisitor) {
        // Noop
    }

}
