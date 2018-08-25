# Giter8 template for a Scala SBT project

## Usage

Use with
```
sbt new jcaraballo/sbt.g8
```

And maybe afterwards
```
cd <name-of-the-project>
git init
git add * .gitignore
git commit -m 'Initial commit from g8 template'
```

And then maybe even
```
git remote add origin git@github.com:<github-user>/<name-of-the-project>.git
git push -u origin master
```

## Alternative: Usage from cloned repository

If you prefer to use it from your own cloned version --for example, because you've forked or you want to modifiy this template for your own custom needs--, you can do so with:

```
git clone https://github.com/jcaraballo/sbt.g8.git
sbt file://sbt.g8
```

Note that here `sbt.g8` is the relative path to your directory with the cloned repository of the template.
