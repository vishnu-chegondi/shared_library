def coverageTest(String module, String settings) {
    sh "coverage run manage.py test ${module}  --settings=${settings} --verbosity 2"
}

