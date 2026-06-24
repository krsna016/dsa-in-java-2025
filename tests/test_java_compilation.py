import unittest
import subprocess
import os

class TestJavaCompilation(unittest.TestCase):
    
    def test_javac_compilation_integrity(self):
        # We test all Java files in the repository to ensure they compile correctly
        # This guarantees zero syntax errors and valid standard library imports across all DSA modules.
        base_dir = os.path.dirname(os.path.dirname(__file__))
        
        # Recursively find all java files
        java_files = []
        for root, dirs, files in os.walk(base_dir):
            for file in files:
                if file.endswith(".java"):
                    java_files.append(os.path.join(root, file))
        
        self.assertTrue(len(java_files) > 0, "No Java files found to compile.")
        
        # Execute the Java Compiler
        # Since these are distinct algorithms without cross-package dependencies,
        # compiling them directly is mathematically sufficient.
        cmd = ["javac"] + java_files
        result = subprocess.run(cmd, capture_output=True, text=True)
        
        self.assertEqual(
            result.returncode, 
            0, 
            msg=f"Java compilation failed:\n{result.stderr}"
        )
            
        # Clean up the generated .class files after compilation
        for file in java_files:
            class_file = file.replace(".java", ".class")
            if os.path.exists(class_file):
                os.remove(class_file)

if __name__ == '__main__':
    unittest.main()
