package org.amshove.kluent

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import java.io.File

fun File.shouldExist() = assertTrue("The file does not exist", this.exists())
fun File.shouldNotExist() = assertFalse("The file exists", this.exists())


fun File.shouldBeDir() = assertTrue("The file is not a directory", this.isDirectory)
fun File.shouldNotBeDir() = assertFalse("The file is a directory", this.isDirectory)


fun File.shouldBeFile() = assertTrue("The file is not a file", this.isFile)
fun File.shouldNotBeFile() = assertFalse("The file is a file", this.isFile)
