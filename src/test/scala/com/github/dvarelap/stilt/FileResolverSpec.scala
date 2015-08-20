package com.github.dvarelap.stilt

class FileResolverSpec extends ShouldSpec {

  "FileResolverSpec" should "detect a directory" in {
    FileResolver.hasLocalDirectory("public/components") should be(true)
  }
}
